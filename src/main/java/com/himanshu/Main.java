package com.himanshu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScientificCalculator calculator = new ScientificCalculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("What operation do you want to perform");
        System.out.flush(); // Force output immediately
        System.out.println("1. Square root");
        System.out.println("2. Factorial");
        System.out.println("3. Natural Logarithm");
        System.out.println("4. Power");
        System.out.flush(); // Flush after each output block

        int choice = scanner.nextInt();

        System.out.println("Enter the number");
        System.out.flush();

        double doubleNumber;
        long longNumber;

        switch (choice) {
            case 1:
                doubleNumber = scanner.nextDouble();
                System.out.println(calculator.sqrt(doubleNumber));
                System.out.flush();
                break;
            case 2:
                longNumber = scanner.nextLong();
                System.out.println(calculator.factorial(longNumber));
                System.out.flush();
                break;
            case 3:
                doubleNumber = scanner.nextDouble();
                System.out.println(calculator.naturalLog(doubleNumber));
                System.out.flush();
                break;
            case 4:
                doubleNumber = scanner.nextDouble();
                System.out.println("Enter the exponent");
                System.out.flush();
                int exponent = scanner.nextInt();
                System.out.println(calculator.power(doubleNumber, exponent));
                System.out.flush();
                break;
            default:
                System.out.println("Invalid operation");
                System.out.flush();
        }

        System.out.println("What operation do you want to perform");
        System.out.flush();
    }
}
