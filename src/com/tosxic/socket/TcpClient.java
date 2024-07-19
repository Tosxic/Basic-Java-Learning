package com.tosxic.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.channels.SocketChannel;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1", 10001);
        OutputStream out = s.getOutputStream();
        out.write("tcp message...".getBytes());
        s.close();
    }
}
