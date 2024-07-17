package com.tosxic.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
* writer和reader面向字符流
* */
public class ReaderAndWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\Exploration\\java-learning\\io\\Test.txt");
            fw.write("test");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        FileReader fr = null;
        try {
            fr = new FileReader("D:\\Exploration\\java-learning\\io\\Test.txt");
            char[] buf = new char[1024];
            int len = 0;
            while((len = fr.read(buf)) != -1) {
                System.out.println(new String(buf, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
