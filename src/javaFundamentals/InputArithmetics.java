package javaFundamentals;

import java.util.Scanner;

public class InputArithmetics {
    public static void main(String[] args) {
       

        int num1;
        int num2;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        num1 = scan.nextInt();

        System.out.println("Number " + num1);

        System.out.print("Enter number : ");
        num2 = scan.nextInt();

        System.out.println("Number " + num2);

        System.out.println(("Equals: ") + (num1 / num2));
       
    }

}
