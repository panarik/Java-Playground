package com.github.panarik.net;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static final String HOST = "localhost";
    private static final int PORT = 12345;
    private static Scanner SCANNER = new Scanner(System.in);



    public static void main(String[] args) {

        try (Socket socket = new Socket(HOST, PORT)) {
            System.out.println("Connected");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            while (true) {
                String message = SCANNER.nextLine(); //создаем сообщение
                out.writeUTF(message); //отправляем сообщение
                Thread.sleep(500); //тупо ждем сервер
                message = in.readUTF();
                System.out.println("Received: "+message);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }


}
