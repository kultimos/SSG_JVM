package com.kul.noconstruct;

public class Parent {
    public static int num = 6;
    static {
        System.out.println("Parent初始化了");
    }
}
