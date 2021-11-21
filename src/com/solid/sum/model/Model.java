package com.solid.sum.model;

import com.solid.sum.io.IData;
import com.solid.sum.io.IPrinter;
import com.solid.sum.service.IService;

public class Model {

    int a, b, sum;

    public void init(IData data) {
        a = data.input("Enter a: ");
        b = data.input("Enter b: ");
    }

    public void calc(IService service) {
        sum = service.calculate(a, b);
    }

    public void done(IPrinter printer) {
        printer.print("Resutl: ");
        printer.print(sum);
    }

}
