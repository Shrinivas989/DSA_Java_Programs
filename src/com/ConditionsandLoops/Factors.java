package com.ConditionsandLoops;

//Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner S= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=S.nextInt();

        for (int i = 1; i < n; ++i) {
            if (n % i == 0)
            {
                System.out.println(i + " ");
            }

        }

    }

}
