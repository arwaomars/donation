package lifeindonation;


import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LifeInDonation {

    static Connection c_Connection; 
    static Statement statement;
    static String query;
    
    public static void main(String[] args) throws SQLException {
        int choice = 0;
              
            System.out.println("\n.......life in Donation........ ");
            System.out.println("-------------------------------------------------");
            System.out.println("Choose a Role: ");
            System.out.println("> 1- Donor");
            System.out.println("> 2- Those in need");
            System.out.println("> 3- Exit");
            System.out.println("-------------------------------------------------");
      
            Scanner keyboard = new Scanner(System.in);
            choice = keyboard.nextInt();
       
            switch(choice){
       
            case 1:
                Donor(); 
                break;
            
            case 2:
                Those_in_need();
                break; 
        
            case 3:
                exit(0);
                break;

            default:
            System.out.println("Invalid Choice Try Again");
                                                                                                      
            }
 
    }
    
    
    public static void Donor(){
        
        User u = new User();
        u.create_donor_table();
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter The Following Personal information: ");
                System.out.print("ID: ");
                int id = keyboard.nextInt();
                System.out.print("First Name: ");
                String first_name = keyboard.next();
                System.out.print("Middle Name: ");
                String middle_name = keyboard.next();
                System.out.print("Surname: ");
                String surname = keyboard.next();
                System.out.print("Phone Number: ");
                int phone_number = (int) keyboard.nextLong();
               
                /*while(new Integer(phone_number).toString().length() != 10){
                if (new Integer(phone_number).toString().length() == 10){
                break;
                }else{
                System.out.println("\n!!wrong input!! \nPhone Number Consist of 10 Integer, Try Again!");
                System.out.print("Phone Number: ");
                phone_number = (int) keyboard.nextLong();
                }
                }
                keyboard.nextLine();*/
                
                
                System.out.print("email: ");
                String email = keyboard.nextLine();
                
                System.out.print("Address: ");
                String address = keyboard.nextLine();
                
                Donor donor_info = new Donor(id, 
                        first_name, middle_name, surname, phone_number, 
                        address, email);
                
    }
    
    public static void Those_in_need(){
        Scanner keyboard = new Scanner(System.in);
        
        User u = new User();
        u.create_PiN_table();
        
                System.out.println("Please Enter The Following Personal information: ");
                
                System.out.print("\nEnter your National Identity Number: ");
                int N_id = (int) keyboard.nextLong();
        
                /*while(new Integer(N_id).toString().length() != 10){
                  if (new Integer(N_id).toString().length() == 10){
                    break;
                  }else{
                    System.out.println("\n!!wrong input!! \nNational Identity Consist of 10 Integer, Try Again!");
                    System.out.print("National Identity: ");
                    N_id = (int) keyboard.nextLong();
                 }
                }*/
                
                System.out.print("First Name: ");
                String first_name = keyboard.next();
                
                System.out.print("Middle Name: ");
                String middle_name = keyboard.next();
                
                System.out.print("Surname: ");
                String surname = keyboard.next();
                
                System.out.print("Phone Number: ");
                int phone_number = (int) keyboard.nextLong();
               
                /*while(new Integer(phone_number).toString().length() != 10){
                    if (new Integer(phone_number).toString().length() == 10){
                    break;
                }else{
                    System.out.println("\n!!wrong input!! \nPhone Number Consist of 10 Integer, Try Again!");
                    System.out.print("Phone Number: ");
                    phone_number = (int) keyboard.nextLong();
                    }
                }
                keyboard.nextLine();
                */
                
                System.out.print("email: ");
                String email = keyboard.nextLine();
                
                System.out.print("Address: ");
                String address = keyboard.nextLine();
                
                
                PersonInNeed person_in_need_info =new PersonInNeed(N_id, 
                        first_name, middle_name, surname, phone_number, 
                        address, email);
           
    }
        
    
}

