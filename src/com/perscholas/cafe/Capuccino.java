package com.perscholas.cafe;

import java.util.Scanner;

public class Capuccino extends Product {

    private boolean peppermint;
    private boolean whippedCream;

    Capuccino () {
        super();
        this.peppermint = false;
        this.whippedCream = false;
    }

    Capuccino (String name, double price, String desc, boolean peppermint,boolean whippedCream) {
        super(name,price,desc);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    public boolean getPeppermint () { return peppermint; }
    public boolean getWhippedCream () { return whippedCream; }
    public void setPeppermint (boolean peppermint) { this.peppermint = peppermint; }
    public void setWhippedCream (boolean whippedCream) { this.whippedCream = whippedCream; }

    @Override
    public String getDesc () {
        String des = super.getDesc();
        des += "\n";
        if (peppermint) {
            des+= "With peppermint. ";
        }
        if (whippedCream) {
            des+= "With whipped cream.";
        }

        return des;
    }

    @Override
    public double calculateProductTotal() {
        double total = getQuant() * getPrice();
        if (peppermint)
            total+= 2;
        if (whippedCream)
            total+= 1;
        return total;
    }

    @Override
    public void setExtras(Scanner input) {
        System.out.println("Would you like peppermint? (Y/N)");
        input.nextLine();
        String bool = input.nextLine();
        if (bool.equals("Y") || bool.equals("y")) {
            setPeppermint(true);
        }

        System.out.println("Would you like whipped cream? (Y/N)");
        bool = input.nextLine();
        if (bool.equals("Y") || bool.equals("y")) {
            setWhippedCream(true);
        }

    }
}
