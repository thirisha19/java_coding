package com.coding;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Demonstrates swapping two integer values without using a third variable.
 */
public class Swap {
    /**
     * Entry point of the application.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = 0, b = 0;
            System.out.print("Enter value for a: ");
            while (true) {
                try {
                    a = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Please enter an integer for a: ");
                    sc.next(); // clear invalid input
                }
            }
            System.out.print("Enter value for b: ");
            while (true) {
                try {
                    b = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.print("Invalid input. Please enter an integer for b: ");
                    sc.next();
                }
            }

            // Swap without third variable
            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After swap:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}