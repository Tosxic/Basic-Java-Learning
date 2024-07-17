package com.tosxic.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

    public static void writeFile() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Exploration\\java-learning\\io\\stream.txt");
        fos.write("abc".getBytes());
        fos.close();
    }

    public static void readFile() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Exploration\\java-learning\\io\\stream.txt");
        int ch = 0;
        while((ch = fis.read()) != -1) {
            System.out.println((char)ch);
        }
        fis.close();
    }

    public static void main(String[] args) {
        try {
            writeFile();
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
