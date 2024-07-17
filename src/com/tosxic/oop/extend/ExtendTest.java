package com.tosxic.oop.extend;

/*
* 测试类
* */
public class ExtendTest {
    public static void main(String[] args) {
        Person x = new Person("tosxic", 25, true);
        x.abPrint();
        x.print();
        x.eat();
        Worker y = new Worker("hanson", 16, false, "student");
        y.eat();
    }
}
