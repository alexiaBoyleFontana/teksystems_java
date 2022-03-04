package com.perscholas.cafe;

import java.util.Scanner;

public class Coffee extends Product {

    private boolean sugar;
    private boolean milk;

    Coffee () {
        super();
        this.sugar = false;
        this.milk = false;
    }

    Coffee (String name, double price, String desc, boolean sugar,boolean milk) {
        super(name,price,desc);
        this.sugar = sugar;
        this.milk = milk;
    }

    public boolean getSugar () { return sugar; }
    public boolean getMilk () { return milk; }
    public void setSugar (boolean sugar) { this.sugar = sugar; }
    public void setMilk (boolean milk) { this.milk = milk; }

    @Override
    public String getDesc () {
        String des = super.getDesc();
        des += "\n";
        if (milk) {
            des+= "With milk. ";
        }
        if (sugar) {
            des+= "With sugar.";
        }

        return des;
    }

    @Override
    public double calculateProductTotal() {
        return getQuant() * getPrice();
    }

    @Override
    public void setExtras(Scanner input) {
        System.out.println("Would you like sugar? (Y/N)");
        input.nextLine();
        String bool = input.nextLine();
        if (bool.equals("Y") || bool.equals("y")) {
            setSugar(true);
        }

        System.out.println("Would you like milk? (Y/N)");
        bool = input.nextLine();
        if (bool.equals("Y") || bool.equals("y")) {
            setMilk(true);
        }

    }
}
