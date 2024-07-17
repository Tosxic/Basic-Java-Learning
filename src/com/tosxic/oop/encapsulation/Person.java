package com.tosxic.oop.encapsulation;

public class Person {
    private String name;
    private int age;
    private String attribute1;      // 类内访问
    String attribute2;              // 同一个包内访问
    protected String attribute3;    // 不同包子类访问
    public String attribute4;       // 均可访问

    public static int num;          // 类共享

    /*
    * 构造函数重载
    * */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age) {
        this.name = "UNKNOWN";
        this.age = age;
    }

    /*
    * 以下为各属性的get和set方法
    * 其中static修饰的方法只能访问static成员
    * */
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

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Person.num = num;
    }
}
