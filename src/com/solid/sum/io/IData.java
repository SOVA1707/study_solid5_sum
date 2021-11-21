package com.solid.sum.io;

public interface IData extends IPrinter, IReader {
    default int input(String text) {
        print(text);
        return read();
    }
}
