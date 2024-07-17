package com.tosxic.oop.extend;

public class Person extends AbstractPerson{
    /*
    * super调用父类构造函数
    * */
    private boolean sex;
    public Person(String name, int age, boolean sex) {
        super(name, age);
        this.sex = sex;
    }

    /*
    * 重写抽象方法
    * */
    public void print() {
        super.abPrint();
        System.out.println("And I'm a person!");
    }

    public void eat() {
        System.out.println("Person is eating.");
    }
}
