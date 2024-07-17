package com.tosxic.oop.interfaces.service;

/*
* 接口的成员变量默认是public static final
* 接口的成员方法默认是public abstract
* */
public interface MathService01 {
    double PI = 3.1415926;
    int sum(int a, int b);
    int sub(int a, int b);
    double circleArea(int r);
}
