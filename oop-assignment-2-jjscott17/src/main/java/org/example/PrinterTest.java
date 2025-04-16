package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    public void printDoubleSided() {
        int expected = 6;
        Printer printer = new Printer(50, true);
        System.out.println("Printing 11 pages in duplex mode (double sided)...");
        printer.printPages(11);
        System.out.println("Pages printed:"+printer.getPagesPrinted());
        assertEquals(expected, printer.getPagesPrinted());
    }

    @Test
    public void printSingleSided() {
        int expected = 11;
        Printer printer = new Printer(50, false);
        System.out.println("Printing 11 pages (single sided)...");
        printer.printPages(11);
        System.out.println("Pages printed:"+printer.getPagesPrinted());
        assertEquals(expected, printer.getPagesPrinted());
    }

    @Test
    public void tonerCheck() {
        // program should return with -1 if the toner is not between 0 and 100
        int expected = -1;
        Printer printer = new Printer(1, true);
        assertEquals(expected, printer.addToner(100));
    }
}