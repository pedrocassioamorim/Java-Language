package application;

import entities.ComboDevice;
import entities.ConcretPrinter;
import entities.ConcretScanner;

public class Main {
    public static void main(String[] args) {

        ConcretPrinter p = new ConcretPrinter("1080");
        p.processDoc("Pedro Cássio");
        p.print("My name is Pedro");
        System.out.println("==================================================================");
        ConcretScanner r = new ConcretScanner("2000");
        r.processDoc("Dias de Amorim");
        System.out.println("Scan result: " + r.scan());
        System.out.println("==================================================================");
        ComboDevice t = new ComboDevice("5000");
        t.print("Pedro Esperto");
        t.processDoc("Pedro Programador");
        System.out.println("Scan realizado: " + t.scan());

    }
}