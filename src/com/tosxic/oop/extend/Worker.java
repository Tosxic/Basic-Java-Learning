package com.tosxic.oop.extend;

public class Worker extends Person{

    private String job;
    public Worker(String name, int age, boolean sex, String job) {
        super(name, age, sex);
        this.job = job;
    }

    /*
    * 重写父类eat方法
    * */
    public void eat() {
        System.out.println("Worker is eating.");
    }
}
