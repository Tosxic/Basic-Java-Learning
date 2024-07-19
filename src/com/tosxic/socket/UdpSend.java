package com.tosxic.socket;

import java.io.IOException;
import java.net.*;

public class UdpSend {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10002);
        byte[] buf = "udp message...".getBytes();
        DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10000);

        ds.send(dp);

        ds.close();
    }
}
