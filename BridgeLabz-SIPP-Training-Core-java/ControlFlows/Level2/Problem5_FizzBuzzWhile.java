package ControlFlows.level2;

import java.util.Scanner;

public class Problem5_FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        int i = 1;
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
        }
        
        input.close();
    }
} 