package com.solid.sum.io;

import java.util.Scanner;

public class Reader implements IReader {

    private Scanner sc;

    public Reader(Scanner sc) {
        this.sc = sc;
    }

    @Override
    public int read() {
        return sc.nextInt();
    }
}
