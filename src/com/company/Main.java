package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUM_EMPLOYEES = 5;
        int[] hours = new int[NUM_EMPLOYEES];
        double payRate, grosspay, overtime;

        System.out.println("Enter the numbers of hours worked by five"
                + "employees who earn the same"
                + " hourleyRate");
        // Get each employees hourley worked
        for (int i = 0; i < NUM_EMPLOYEES; i++)
        {
            System.out.println("Employees" + (i + 1) + ":");
            hours[i] = input.nextInt();


        }

        // Get each the hourley pay rate.
        System.out.println(" Enter the hourley payrate for each employee: ");
        payRate = input.nextDouble();


        // dispalay each employee's gross pay.

        System.out.println("here is the gross pay for each employee: ");
        for (int i = 0; i < NUM_EMPLOYEES; i++)
        {

            if (hours[i] > 40)
            {
                // calcualate base pay
                grosspay = 40 * payRate;
                // calculate overtime pay
                overtime = (hours[i] - 40) * (1.5 * payRate);
                // Add base pay and overtime
                grosspay += overtime;
            } else
                grosspay = hours[i] * payRate;
            System.out.println("Employee #" + (i + 1) + " : $" + grosspay);


        }
    }
}
