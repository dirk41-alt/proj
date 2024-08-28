package javaFundamentals;
import java.util.Scanner;
public class emailString {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        String email, email2 = new String(), password, password2 = new String(), password3;
       


        System.out.println("[1] Login ");
        System.out.println("[2] Register ");
        System.out.println();
        System.out.print("Enter Choice: ");
        int choice = scan.nextInt();

       
        

        switch (choice) {
            case 1:
              System.out.print("Email: ");
              email = scan.next();
              System.out.print("Pasword: ");
              password = scan.next();

              if (email2.equals(email) && password2.equals(password)){
                System.out.println("Welcome to the system! ");
              } else {
                System.out.println("Account is not registered");
              }
             
            break;

            case 2:
              System.out.println("Enter Email: ");
              email2 = scan.next();
              System.out.println("Enter Password: ");
              password2 = scan.next();
              System.out.println("Re-Enter Password: ");
              password3 = scan.next();
              

            
              if (!password2.equals(password3)) {
                System.out.println("Passwords do not match. Try again.");
            } else {
                System.out.println("Passwords match.");
            }
        
            break;
        
        default:
            break;
        }
        
        
        
        
        

      

    }

}
