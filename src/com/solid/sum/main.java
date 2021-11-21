package com.solid.sum;

import com.solid.sum.io.*;
import com.solid.sum.model.Model;
import com.solid.sum.service.IService;
import com.solid.sum.service.ServiceSum;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
//        File file = new File("numbers.txt");
        Scanner sc = new Scanner(System.in);
        IReader reader = new Reader(sc);
        IPrinter printer = new PrinterStars();
        IData data = new Data(reader, printer);
        IService service = new ServiceSum();
        Model model = new Model();

        model.init(data);
        model.calc(service);
        model.done(printer);
    }
}
