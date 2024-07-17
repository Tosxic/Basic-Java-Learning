package com.tosxic.oop.extend;

/*
* 定义抽象类,不可以被实例化
* */
public abstract class AbstractPerson {
    private String name;
    private int age;
    public AbstractPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
    * 抽象方法由子类重写
    * */
    public abstract void print();
    public void abPrint() {
        System.out.println("I'm a abstract person!");
    }
}
