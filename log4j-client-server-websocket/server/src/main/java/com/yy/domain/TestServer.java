package com.yy.domain;

/**
 * Created by yanyong on 2020/6/3.
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class TestServer {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(5000);
        while (true) {
            Socket client = socket.accept();
            Thread t = new Thread(new LogRunner(client));
            t.start();
        }
    }
}