package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ConsoleServer {

    private static final int PORT = 12345;
    private static Socket socket;
    private static DataInputStream in;
    private static DataOutputStream out;
    private Thread ServerConsoleThread;

    public static void main(String[] args) {

    }

    private void runServer() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started!");
            //конектимся
            connection(serverSocket);
            //запускаем отдельный поток
            ServerConsoleThread = new Thread(() -> {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("You can enter message for client >>>>>");
                while (!Thread.currentThread().isInterrupted()) {
                    if (bufferedReader.ready()) {


                    }

                }
            });

        }
    }

    private void connection(ServerSocket serverSocket) throws IOException {
        System.out.println("Waiting for connection........");
        socket = serverSocket.accept();
        System.out.println("Client has connected!");
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
    }

}
