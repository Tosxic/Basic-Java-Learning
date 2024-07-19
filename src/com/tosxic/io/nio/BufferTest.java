package com.tosxic.io.nio;

import java.nio.IntBuffer;

public class BufferTest {
    public static void main(String[] args) {
        // 创建buffer
        IntBuffer intBuffer = IntBuffer.allocate(5);

        // 向buffer写入值
        for(int i = 0; i < 5; ++i) {
            intBuffer.put(i + 2);
        }

        // 读写转换
        intBuffer.flip();

        // buffer读取
        while(intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }
    }
}
