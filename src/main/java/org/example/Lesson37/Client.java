package org.example.Lesson37;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        try {
                Socket socket = new Socket("localhost", 12345);
                PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                writer.println("Привіт, сервере!");

                String serverResponse = reader.readLine();
                System.out.println("О " + getCurrentTime() + " від " + socket.getInetAddress() + " отримано рядок: " + serverResponse);

                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static String getCurrentTime() {
            return new SimpleDateFormat("HH:mm").format(new Date());
        }
    }

