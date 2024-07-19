package com.tosxic.io.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelTest {
    public static void main(String[] args) throws IOException {
        String str = "Hello";
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Exploration\\java-learning\\io\\Test.txt");

        // 文件读写channel
        FileChannel fileChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put(str.getBytes());
        byteBuffer.flip();

        // 写入数据
        fileChannel.write(byteBuffer);
        fileOutputStream.close();
    }
}
