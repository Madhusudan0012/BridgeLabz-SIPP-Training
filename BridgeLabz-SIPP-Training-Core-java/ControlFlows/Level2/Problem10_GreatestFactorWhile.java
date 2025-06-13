package ControlFlows.level2;

import java.util.Scanner;

public class Problem10_GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int number = input.nextInt();
        
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        int greatestFactor = 1;
        int counter = number - 1;
        
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        
        System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        
        input.close();
    }
} 