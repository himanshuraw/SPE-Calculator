package com.himanshu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScientificCalculator calculator = new ScientificCalculator();

        Scanner scanner = new Scanner(System.in);
        double doubleNumber;
        long longNumber;

        while(true){
            System.out.println("What operation do you want to perform - ");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");

            System.out.println("Enter the number");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    doubleNumber = scanner.nextDouble();
                    System.out.println(calculator.sqrt(doubleNumber));
                    break;
                case 2:
                    longNumber = scanner.nextLong();
                    System.out.println(calculator.factorial(longNumber));
                    break;
                case 3:
                    doubleNumber = scanner.nextDouble();
                    System.out.println(calculator.naturalLog(doubleNumber));
                    break;
                case 4:
                    doubleNumber = scanner.nextDouble();
                    System.out.println("Enter the exponent");
                    int exponent = scanner.nextInt();
                    System.out.println(calculator.power(doubleNumber, exponent));
                    break;
                case 5: System.exit(0);

                default: System.out.println("Invalid operation");
            }
        }

    }
}