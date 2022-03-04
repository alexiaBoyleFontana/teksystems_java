package com.perscholas.cafe;

import java.util.Scanner;

public class Espresso extends Product {

    private boolean extraShot;
    private boolean macchiato;

    Espresso () {
        super();
        this.extraShot = false;
        this.macchiato = false;
    }

    Espresso (String name, double price, String desc, boolean extra ,boolean macchi) {
        super(name,price,desc);
        this.extraShot = extra;
        this.macchiato = macchi;
    }

    public boolean isExtraShot () { return extraShot; }
    public boolean isMacchiato () { return macchiato; }
    public void setExtraShot (boolean extraShot) { this.extraShot = extraShot; }
    public void setMacchiato (boolean macchiato) { this.macchiato = macchiato; }

    @Override
    public String getDesc () {
        String des = super.getDesc();
        des += "\n";
        if (extraShot) {
            des+= "With extra shot. ";
        }
        if (macchiato) {
            des+= "Macchiato style.";
        }

        return des;
    }

    @Override
    public double calculateProductTotal() {
        double total = getQuant() * getPrice();
        if (extraShot)
            total+= 2;
        if (macchiato)
            total+= 1;
        return total;
    }

    @Override
    public void setExtras(Scanner input) {
        System.out.println("Would you like an extra shot? (Y/N)");
        input.nextLine();
        String bool = input.nextLine();
        if (bool.equals("Y") || bool.equals("y")) {
            setExtraShot(true);
        }

        System.out.println("Would you like a macchhiato? (Y/N)");
        bool = input.nextLine();
        if (bool.equals("Y") || bool.equals("y")) {
            setMacchiato(true);
        }

    }
}