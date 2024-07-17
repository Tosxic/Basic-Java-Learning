package com.tosxic.io;

import java.io.*;

/*
* FileWriter和FileReader直接与文件交互，也就是直接访问磁盘，效率低
* BufferedWriter和BufferedReader会先将数据缓存到缓存区内存中，再一次性处理，效率高
* */
public class BufferedTest {
    public static void main(String[] args) {
        BufferedReader bufr = null;
        BufferedWriter bufw = null;

        try {
            bufr = new BufferedReader(new FileReader("D:\\Exploration\\java-learning\\io\\Test.txt"));
            bufw = new BufferedWriter(new FileWriter("D:\\Exploration\\java-learning\\io\\bufTest.txt"));
            String line = null;
            while((line = bufr.readLine()) != null) {
                bufw.write(line);
                bufw.newLine();
                bufw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException("读写失败");
        } finally {
            if(bufr != null) {
                try {
                    bufr.close();
                } catch (IOException e) {
                    throw new RuntimeException("读写失败");
                }
            }

            if(bufw != null) {
                try {
                    bufw.close();
                } catch (IOException e) {
                    throw new RuntimeException("读写失败");
                }
            }
        }
    }
}
