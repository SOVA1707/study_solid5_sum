package com.solid.sum.io;

public class Printer implements IPrinter {
    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void print(int a) {
        System.out.println(a);
    }
}
