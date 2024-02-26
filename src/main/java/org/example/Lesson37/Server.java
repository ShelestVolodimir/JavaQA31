package org.example.Lesson37;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Сервер запущено...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                    System.out.println("Підключено новий клієнт");

                    BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

                    String clientMessage = reader.readLine();
                    String timestamp = new SimpleDateFormat("HH:mm").format(new Date());
                    System.out.println("О " + timestamp + " від " + clientSocket.getInetAddress() + " отримано рядок: " + clientMessage);

                    writer.println("Привіт, клієнте!");

                    clientSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
