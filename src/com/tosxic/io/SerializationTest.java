package com.tosxic.io;

import com.tosxic.oop.polymorphism.Animal;

import java.io.*;

/*
* 序列化可以将对象转化为持久化数据
* 反序列化可以将持久化的对象数据加载实例化
* */
public class SerializationTest {
    public static void main(String[] args) {
        File file = new File("D:\\Exploration\\java-learning\\io\\TestClass.out");

        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(file));
            TestClass tc = new TestClass("Jerry", 12, 15);
            out.writeObject(tc);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(file));
            TestClass tc = (TestClass)in.readObject();
            System.out.println(tc);
            tc.print();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}

/*
* 要序列化的类需要实现Serializable接口
* transient关键字修饰的字段会忽略
* */
class TestClass implements Serializable {
    private String name;
    private int age;

    transient private int time;

    public TestClass(String name, int age, int time) {
        this.name = name;
        this.age = age;
        this.time = time;
    }

    public void print() {
        System.out.println("I'm " + this.name + ". ");
        System.out.println("I'm " + this.age + ". ");
        System.out.println("The time is " + this.time + ". ");
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + time +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}