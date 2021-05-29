package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ConsoleServer {

    private static final int PORT = 12345;
    private static Socket socket;
    private static DataInputStream in;
    private static DataOutputStream out;
    private Thread serverConsoleThread;

    public static void main(String[] args) {

    }

    private void runServer() {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started!");

            //ждем соединения
            waitingConnection(serverSocket);
            //запускаем консоль
            startConsoleThread();

            //читаем сообщения
            String msg = in.readUTF();


        }
    }

    private void startConsoleThread() {
        //запускаем отдельный поток для косольки сервера
        serverConsoleThread = new Thread(() -> {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("You can enter message for client >>>>>");
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    if (bufferedReader.ready()) {
                        String messageToServer = bufferedReader.readLine();
                        out.writeUTF(messageToServer);
                        Thread.sleep(200);
                    }
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });
        serverConsoleThread.start();
    }

    private void waitingConnection(ServerSocket serverSocket) throws IOException {
        System.out.println("Waiting for connection........");
        socket = serverSocket.accept();
        System.out.println("Client has connected!");
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
    }

}
