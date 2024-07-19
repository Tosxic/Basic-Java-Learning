package com.tosxic.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.ServerSocketChannel;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        // 创建socket监听端口
        ServerSocket ss = new ServerSocket(10001);

        while(true) {
            Socket s = ss.accept();
            String ip = s.getInetAddress().getHostAddress();
            System.out.println(ip + " connected!");
            InputStream in = s.getInputStream();
            byte[] buf = new byte[1024];
            int len = in.read(buf);
            System.out.println(new String(buf, 0, len));
            s.close();
        }
    }
}
