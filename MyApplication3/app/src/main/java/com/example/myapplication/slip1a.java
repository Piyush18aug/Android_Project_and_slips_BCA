package com.example.myapplication;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.io.*;
import java.net,*;

public class slip1a {
    public static void main(String[] args) throws Exception{
        ServerSocket server=new ServerSocket(5000);
        System.out.println("system is running");

        while(true)
        {
            Socket socket=server.accept();
            PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
            out.print(new Date());
            server.close();
        }
    }
}


