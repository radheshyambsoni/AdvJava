package SocketProgramming;
import java.io.*;
import java.net.*;
    public class Server {
        public static void main(String[] args) {
            System.out.println("Waiting for a connection request...");
            try {
                ServerSocket ss = new ServerSocket(5000);
                Socket s = ss.accept();
                System.out.println("Connection established!\n");

                InputStreamReader in = new InputStreamReader(s.getInputStream());
                BufferedReader br = new BufferedReader(in);
                String msg = br.readLine();
                System.out.println("Message has been recieved as: " + msg);
                System.out.println("Returning the same msg to client");
                
                PrintWriter pr = new PrintWriter(s.getOutputStream());
                pr.println(msg);
                pr.flush();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }