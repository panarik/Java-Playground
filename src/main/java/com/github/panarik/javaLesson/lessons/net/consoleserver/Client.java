package com.github.panarik.javaLesson.lessons.net.consoleserver;

import java.io.*;
import java.net.Socket;

public class Client {

    private final String HOST = "localhost";
    private final int PORT = 12345;
    private DataInputStream in;
    private DataOutputStream out;
    private Thread clientConsoleThread;

    public static void main(String[] args) {
        new Client().runClient();
    }

    private void runClient() {
        try (Socket socket = new Socket(HOST, PORT)) {
            System.out.println("Client started!");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            //запускаем консоль
            startConsoleThread();

            while (true) {
                //читаем сообщения
                String msg = in.readUTF();
                if (msg.equals("/end")) {
                    shutdownClient(socket);
                    break;
                }
                System.out.println("Received: " + msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("FINISHED");
        }
    }

    private void shutdownClient(Socket socket) throws IOException {
        clientConsoleThread.interrupt();
        socket.close();
        System.out.println("Client stopped");

    }

    private void startConsoleThread() {
        //запускаем отдельный поток для косольки клиента
        clientConsoleThread = new Thread(() -> {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("You can enter message for server >>>>>");
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    if (bufferedReader.ready()) {
                        String messageToClient = bufferedReader.readLine();
                        out.writeUTF(messageToClient);
                        Thread.sleep(200);
                    }
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });
        clientConsoleThread.start();
    }

}
