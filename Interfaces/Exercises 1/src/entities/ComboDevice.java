package entities;

import interfaces.Printer;
import interfaces.Scanner;

public class ComboDevice extends Device implements Scanner, Printer {

    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer & Scanner processing: " + doc);

    }
    @Override
    public void print(String doc) {
        System.out.println("Combo Printer processing: " + doc);
    }

    @Override
    public String scan() {
        return "Comobo Scanner Realizado";
    }
}
