package com.solid.sum.io;

public class PrinterStars implements IPrinter{

    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void print(int a) {
        for (int i = 0; i<a; i++)
            print("*");
        System.out.println();
    }
}
