package com.perscholas.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {

    private static final double SALES_TAX = 1.0625;

    public static void main(String[] args) {
        Product coffee = new Coffee
                ("Coffee", 3.5,
                        "A brewed drink prepared from roasted coffee beans",
                        false, false
                );
        Product espresso = new Espresso
                ("Espresso", 4.7,
                        "A coffee-brewing method in which a small amount of nearly boiling water is forced under pressure through finely-ground coffee beans.",
                        false, false
                );
        Product cappucino = new Capuccino
                ("Capuccino", 3.25,
                        "An espresso-based coffee drink that is prepared with steamed milk foam.",
                        false, false
                );

        ArrayList<Product> products = new ArrayList<Product>();

        products.add(coffee);
        products.add(espresso);
        products.add(cappucino);

        Store store = new Store (products);

        store.start();
        System.out.println("Thanks for shopping at Perscholas! Come again!");
    }
}
