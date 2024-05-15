package entities;

import interfaces.Scanner;

public class ConcretScanner extends Device implements Scanner {
    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    public ConcretScanner(String serialNumber) {
        super(serialNumber);
    }


    @Override
    public String scan() {
        return "Scanner Realizado";
    }
}
