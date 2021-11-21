package com.solid.sum.io;

public class Data implements IData {

    private IReader reader;
    private IPrinter printer;

    public Data(IReader reader, IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        printer.print(text);
    }

    @Override
    public void print(int a) {
        printer.print(a);
    }

    @Override
    public int read() {
        return reader.read();
    }
}
