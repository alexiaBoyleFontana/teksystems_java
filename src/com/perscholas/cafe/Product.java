package com.perscholas.cafe;

import java.util.Scanner;

public abstract class Product {
    private String name;
    private double price;
    private String desc;
    private int quant;

    Product () {
        this.name = "";
        this.price = 0;
        this.desc = "";
        this.quant = 0;
    }

    Product (String name, double price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.quant = 0;
    }

    public String getName () { return name; }
    public double getPrice () { return price; }
    public String getDesc () { return desc; }
    public int getQuant () { return quant; }
    public void setName (String name) { this.name = name; }
    public void setPrice (double price) { this.price = price; }
    public void setDesc (String desc) { this.desc = desc; }
    public void setQuant (int quant) { this.quant = quant; }

    public abstract double calculateProductTotal();

    public abstract void setExtras(Scanner input);
}

