package com.perscholas.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

    private ArrayList<Product> products;
    private int size;

    Store (ArrayList products) {
        this.products = products;
        this.size = products.size();
    }

    public void start () {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Cafe Perscholas!\nPlease select from the following menu.");

        for (int i = 0; i < size ; i++) {
            System.out.println((i+1) + ". " + products.get(i).getName());
        }

        System.out.println((size+1)+". Check Out\n" + (size+2) + ". Cancel");

        //change the menu creation to a secondary function, storing it in a single variable
        // Because this menu needs to be in a loop, no need to have it keep doing it all

        int choice = input.nextInt();

        if (choice > size +2 || choice < 1) {
            System.out.println("Please select a valid menu option.");
        }
        else if (choice == size + 1) {
            checkOut();
        }
        else if (choice == size + 2) {
            return;
        }
        else {

        }



        /*
        int quant;
        double subtotal = 0;

        for (int i = 0; i < products.size() ; i++) {
            System.out.println ("How many orders of " + products.get(i).getName());
            quant = input.nextInt();
            products.get(i).setQuant(quant);
            if (quant > 0) products.get(i).setExtras(input);
            System.out.println(
                    "== " + products.get(i).getName() + " ==\n" +
                            products.get(i).getDesc() +
                            "\nPrice: " + products.get(i).calculateProductTotal() + "\n"
            );
            subtotal+= products.get(i).calculateProductTotal();
        }

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Sales Tax: " + ((SALES_TAX - 1) * 100) + "%");
        String total = String.format ("%.2f", (subtotal * SALES_TAX));
        System.out.println("Total: " + total);*/
    }

    private void checkOut () {
        System.out.println("Unfinished, but thansks for ordering!");
    }
}
