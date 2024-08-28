package javaFundamentals;

import java.util.Scanner;

public class SwitchCaseWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a choice
        System.out.println("Enter a number (1-3):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Additional input inside case 1
                System.out.println("You selected option 1.");
                System.out.println("Enter a string for option 1:");
                String input1 = scanner.next(); // Read a string input
                System.out.println("You entered: " + input1);
                break;
                
            case 2:
                // Additional input inside case 2
                System.out.println("You selected option 2.");
                System.out.println("Enter an integer for option 2:");
                int input2 = scanner.nextInt(); // Read an integer input
                System.out.println("You entered: " + input2);
                break;
                
            case 3:
                // Additional input inside case 3
                System.out.println("You selected option 3.");
                System.out.println("Enter a floating-point number for option 3:");
                float input3 = scanner.nextFloat(); // Read a float input
                System.out.println("You entered: " + input3);
                break;
                
            default:
                System.out.println("Invalid selection. Please choose a number between 1 and 3.");
                break;
        }

        scanner.close();
    }
}



