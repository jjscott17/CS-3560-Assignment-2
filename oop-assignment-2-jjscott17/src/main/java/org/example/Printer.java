package org.example;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    // Constructor
    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    // Method to add toner
    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        return -1;
    }

    // Method to print pages
    public int printPages(int pages) {

        //Define pagesToPrint variable
        // Add conditional statement. If odd, add an extra page


        return 0; // return pagesToPrint;

    }
}