package com.tosxic.oop.interfaces.impl;

import com.tosxic.oop.interfaces.service.MathService;

public class MathServiceImpl implements MathService {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public double circleArea(int r) {
        return PI * r * r;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }
}
