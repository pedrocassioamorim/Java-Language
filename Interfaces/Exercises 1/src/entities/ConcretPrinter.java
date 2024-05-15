package entities;

import interfaces.Printer;

public class ConcretPrinter extends Device implements Printer {
    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    public ConcretPrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}
