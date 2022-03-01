package com.teksystems;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //First exercise
        System.out.println(convertTime(86399));
        System.out.println(convertCelsius(89.6)); //should be 32
        System.out.println ("\n\t== Variable Exercises ==");
        varExercises();
        System.out.println ("\n\t== Cafe Exercise ==");
        cafeExercise();
        System.out.println ("\n\t== Array Exercises ==");
        arrayExercise();

        System.out.println("\n\t==Operator Exercises ==");
        operatorExercise();


    }

    private static String convertTime (int time) {
        //Write a Java program to convert seconds to hour, minute and seconds from total seconds

        System.out.println("\t == Convert Time ==");
        int hours = time / 3600;
        time = time % 3600;
        int minutes = time / 60;
        time = time % 60;

        return hours + ":" + minutes + ":" + time;
    }

    private static double convertCelsius (double fahrenheit) {
        System.out.println("\t ==Convert Celsius== ");
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
        System.out.printf("Total Sale: %.2f\n",totalSale);

    }

    private static void arrayExercise() {
        //1

        System.out.println("#1");
        int[] arr = {1,2,3};
        for (int x : arr) {
            System.out.println (x);

        }

        //2
        System.out.println("#2");
        int[] arr2 = {13,5,7,68,2};

        System.out.println(
                arr2[arr2.length / 2]
        );

        //3
        System.out.println("#3");
        String[] arr3 = {"red", "green", "blue", "yellow"};
        System.out.println("Length: " + arr3.length);
        String[] arr3Copy = arr3.clone();
        System.out.println(Arrays.toString(arr3Copy));

        //4
        System.out.println("#4");
        int[] arr4 = {1,2,3,4, 6};
        System.out.println(arr4[0]);
        System.out.println(arr4[arr4.length - 1]);
            //out of bounds
        //System.out.println(arr4[arr4.length]);
        //arr4[5] = 12;

        //5
        System.out.println("#5");
        int[] arr5 = new int[5];
        for (int x = 0; x < 5; x++) {
            arr5[x] = x;
        }
        System.out.println(Arrays.toString(arr5));

        //6
        System.out.println("#6");
        for (int x = 0; x < 5; x++) {
            arr5[x] = x * 2;
        }
        System.out.println(Arrays.toString(arr5));

        //7
        System.out.println("#7");
        for (int x = 0; x < 5; x++) {
            if (x != (arr5.length / 2)) {
                System.out.println(arr5[x]);
            }
        }

        //8
        System.out.println("#8");
        String arr8[] = {"1", "2", "3", "4", "5"};
        System.out.println(Arrays.toString(arr8));

        String temp = arr8[0];
        arr8[0] = arr8[arr8.length/2];
        arr8[arr8.length/2] = temp;
        System.out.println(Arrays.toString(arr8));

        //9
        System.out.println("#9");
        int[] arrSort = {4,2,9,13,1,0};
        System.out.println ("Initial Array: " + Arrays.toString(arrSort));
        mergesort(arrSort);
        System.out.println("Array in Ascending Order: " + Arrays.toString(arrSort));
        System.out.println("The smallest number is " + arrSort[0]);
        System.out.println("The largest number is " + arrSort[arrSort.length-1]);

        //10
        System.out.println("#10");
        Object[] arr10 = {1, "two", "three", "four", 5.0};
        System.out.println(Arrays.toString(arr10));
    }

    private static void mergesort (int[] toSort) {

        int[] temp = new int[toSort.length];
        mergesort(toSort, temp, 0, toSort.length - 1);

    }

    private static void mergesort (int[] arr, int[] temp, int start, int end) {

        if (start >= end) {
            return;
        }

        int middle = (start + end) / 2;
        mergesort (arr, temp, start, middle);
        mergesort (arr, temp, middle+1, end);

        // then merge

        int size = end - start;

        int left = start;
        int right = middle+1;
        int curr = start;

        while (left <= middle || right <= end) {
            if (left > middle) {
                temp[curr] = arr[right];
                right++;
            }
            else if (right > end) {
                temp[curr] = arr[left];
                left++;
            }
            else if (arr[left] < arr[right]) {
                temp[curr] = arr[left];
                left++;
            }
            else {
                temp[curr] = arr[right];
                right++;
            }
            curr++;
        }

        for (int i = start; i < end + 1; i++) {
            arr[i] = temp[i];
        }

    }

    private static void operatorExercise () {
        int x = 2;

        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = 9;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = 17;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = 88;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        x = 150;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = 225;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = 1555;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = 32456;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        x = 7;
        int y = 17;

        int z = x & y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
        z = x | y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));

        x = 1;
        System.out.println(x);
        x++;
        System.out.println(x);

        x = 1;
        System.out.println(x);
        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);

        x = 5;
        y = 8;
        z = ++x + y;
        System.out.println(z);
        x = 5;
        y = 8;
        z = x++ + y;
        System.out.println(z);




    }

}
