package net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    private static final int PORT = 12345;

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started!");

            //запускаем соединения из серверсокета
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            DataInputStream in = new DataInputStream(socket.getInputStream()); //создаём входящий поток данных
            DataOutputStream out = new DataOutputStream(socket.getOutputStream()); //создаём исходящий поток данных

            while (true) {
                String message = in.readUTF();
                System.out.println("Received: " + message);
                out.writeUTF("Echo: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
