package com.teksystems;

public class AdultUser implements LibraryUser {
    private int age;
    private String bookType;

    AdultUser (int age, String book) {
        this.age = age;
        this.bookType = book;
    }
    public void registerAccount() {
        if (age < 12) {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
        else {
            System.out.println("You have successfully registered under an Adult Account.");
        }
    }
    public void requestBook() {
        if (bookType.equals("fiction") || bookType.equals("Fiction")) {
            System.out.println("Book issued successfully, please return the book within 7 days.");
        }
        else {
            System.out.println("Oops, you are only allowed to take out adult fiction books.");
        }
    }
}
