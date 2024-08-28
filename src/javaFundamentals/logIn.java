package javaFundamentals;
import java.util.Scanner;
public class logIn {
    

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        String email = "";
        String getEmail = "";
        String password = "";
        String getPassword = "";
        int choice = 0;

        do 
        {

            System.out.println("[1]Login ");
            System.out.println("[2]Register ");
            System.out.println("[0]Exit");
    
            System.out.print("Enter Choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                
                    System.out.println("Enter Your Email: ");
                    getEmail = scan.next();
    
                    System.out.println("Enter Your Password: ");
                    getPassword = scan.next();
    
                    if (getEmail.equals(email) && getPassword.equals(password)) 
                    {
                        System.out.println("Access Granted!");
                        return ;
                    }
    
                    else
                    {
                        System.out.println("Access Denied!");
                    }

                    break;
    
                case 2:
    
                    System.out.print("Enter Email: ");
                    email = scan.next();
    
                    System.out.print("Enter Password: ");
                    password = scan.next();
    
                    do
                    {
                        System.out.print("Re-Enter Password: ");
                        getPassword = scan.next();
    
                        if (getPassword.equals(password)) 
                        {
                            System.out.println("Account Has Been Created");
                            System.out.println();
                        }
                    }
    
                    while (!getPassword.equals(password));
                        
                    break;
            
                default:
                    break;
            }
         
        } 
        while (choice != 0);

       
        
    }


}
