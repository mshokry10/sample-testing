package com.appscorner.samples;

import java.math.BigInteger;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public double div(double a, double b) {
        if (b == 0d) throw new IllegalArgumentException();
        return a / b;
    }

    public BigInteger slowFactorial(int num) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
        if (num == 0) return BigInteger.ONE;
        return BigInteger.valueOf(num).multiply(slowFactorial(num - 1));
    }
}
