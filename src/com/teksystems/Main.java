package com.teksystems;

public class Main {

    public static void main(String[] args) {

        //First exercise
        System.out.println(convertTime(86399));
        System.out.println(convertCelsius(89.6)); //should be 32
       varExercises();
       cafeExercise();


    }

    private static String convertTime (int time) {
        //Write a Java program to convert seconds to hour, minute and seconds from total seconds

        int hours = time / 3600;
        time = time % 3600;
        int minutes = time / 60;
        time = time % 60;

        return hours + ":" + minutes + ":" + time;
    }

    private static double convertCelsius (double fahrenheit) {
        return (5.0/9.0) * (fahrenheit - 32);
    }

    private static void varExercises () {
        //Write a program that declares 2 integer variables, assigns an integer to each, and adds them together.
        // Assign the sum to a variable. Print out the result.

        int x = 4, y = 5;
        System.out.println(x + y);

        //Write a program that declares 2 double variables, assigns a number to each, and adds them together.
        // Assign the sum to a variable. Print out the result.

        double z = 4.1, a = 5.2;
        double za = z + a;
        System.out.println(za);

        //Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together.
        // Assign the sum to a variable. Print out the result. What variable type must the sum be?

        double zx = z + x;
        System.out.println(zx);

        // Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. Assign the result to a variable. Print out the result.
        // Now change the larger number to a decimal. What happens? What corrections are needed?

        int yx = y/x;
        System.out.println(yx);
        double doubleY = 5.0;
        double ydx = doubleY/x;
        System.out.println(ydx);

        //Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. Assign the result to a variable.
        // Print out the result. Now, cast the result to an integer. Print out the result again.

        double xda  = x/a;
        System.out.println(xda);
        System.out.println((int) xda);

        //Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
        // Declare a variable q and assign y/x to it and print q.
        // Now, cast y to a double and assign to q. Print q again.

        x = 5;
        y = 6;

        double q = y/x;
        System.out.println(q);
        q = ((double) y)/x;
        System.out.println(q);

        // Write a program that declares a named constant and uses it in a calculation. Print the result.

        final int A_CONSTANT = 7;
        System.out.println(4 + A_CONSTANT);

    }

    private static void cafeExercise () {
        //Write a program where you create 3 variables that represent products at a cafe.
        // The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        // Assign prices to each product. Create 2 more variables called subtotal and totalSale
        // and complete an “order” for 3 items of the first product, 4 items of the second product,
        // and 2 items of the third product. Add them all together to calculate the subtotal.
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        // Be sure to format the results to 2 decimal places.

        double coffee = 5.25;
        double capuccino = 6.50;
        double bagel = 2.50;
        double subtotal = (coffee * 3) + (4  * capuccino) + (2 * bagel);
        final double SALES_TAX = 0.065;
        double totalSale = subtotal + (subtotal * SALES_TAX);
        System.out.printf("Total Sale: %.2f",totalSale);

    }

}
