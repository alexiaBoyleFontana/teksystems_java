package com.teksystems;

public class KidUser implements LibraryUser {
    private int age;
    private String bookType;

    KidUser (int age, String book) {
        this.age = age;
        this.bookType = book;
    }

    public void registerAccount() {
        if (age > 12) {
            System.out.println("Sorry, age must be less than 12 to register as a kid");
        }
        else {
            System.out.println("You have successfully registered under a Kid's Account.");
        }
    }
    public void requestBook() {
        if (bookType.equals("Kids") || bookType.equals("kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days.");
        }
        else {
            System.out.println("Oops, you are only allowed to take out kid's books.");
        }
    }
}
