package SocketProgramming;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message to be sent: ");
        String msg = sc.nextLine();
        System.out.println();
        sc.close();
        try {
            Socket s = new Socket("localhost", 5000);

            PrintWriter pr = new PrintWriter(s.getOutputStream());
            System.out.println("Sending the message...");
            pr.println(msg);
            pr.flush();

            InputStreamReader in = new InputStreamReader(s.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String msgRec = br.readLine();
            System.out.println("Recieved msg from server as: " + msgRec);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}