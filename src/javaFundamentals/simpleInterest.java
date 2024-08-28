package javaFundamentals;
import java.util.Scanner;
public class simpleInterest {
public static void main(String[] args) {
    
Scanner userInputScanner = new Scanner(System.in);

int principalAmount;
int rateOfInterest;
int timeInYears;
double interest;

System.out.print("Enter Amount: ");
principalAmount = userInputScanner.nextInt();
System.out.print("Enter Rate of Interest: ");
rateOfInterest = userInputScanner.nextInt();
System.out.print("Enter Years: ");
timeInYears = userInputScanner.nextInt();

interest = principalAmount * rateOfInterest * timeInYears / 100;

System.out.println(interest);









}


}
