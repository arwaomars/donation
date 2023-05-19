package donationproject;

import java.io.IOException;
import static java.lang.System.exit;
import java.util.*;


public class DonationProject {
    
    public static void main(String[] args) throws IOException {
        
   
        int cin = 0;
       DonationProject d = new DonationProject();
     for (int choice = 0;choice<=7;choice++){
          do{    
              
       System.out.println(".......life in Donation........ ");
       System.out.println("-------------------------------------------------");
       System.out.println("choose an action: ");
       System.out.println("> 1- Donor");
       System.out.println("> 2- Those in need");
       System.out.println("> 3- Exit");
       System.out.println("-------------------------------------------------");
      
       Scanner keyboard = new Scanner(System.in);
       choice = keyboard.nextInt();
       
       switch(choice){
       
       
       case 1:
            Scanner input = new Scanner(System.in); 
        System.out.print("--------------------------------------------------"
                + "\nchoose an action: "
                + "\n> 1- List of needs "
                + "\n> 2- Device donation"
                + "\n------------------------------------------------------\n");
        
        try{
            int userSelection = input.nextInt();
       
            //check input
            while(userSelection != 1 && userSelection != 2){
                System.out.print("\n!! wrong input !! "
                    + "--------------------------------------------------"
                    + "\nchoose an action: "
                    + "\n> 1- List of needs "
                    + "\n> 2- Device donation"
                    + "\n------------------------------------------------------\n");
                userSelection = input.nextInt();
            }
         
              if(userSelection == 1){
                List_of_needs needs=new List_of_needs();
                needs.available_needs_list();
            }
         
            else if(userSelection == 2){
                detailOfDonate();
            }
        
        }catch(Exception e){
           System.out.println("wrong input!!!!!");
        }
          
          break;
       case 2:
           
        Scanner input2 = new Scanner(System.in);
          
        try{
            System.out.print("--------------------------------------------------"
                    + "\nchoose an action: "
                    + "\n> 1- List of available medical devices "
                    + "\n> 2- Add a specific need"
                    + "\n> 3- Order a medical device"
                    + "\n------------------------------------------------------\n");
            int userSelection = input2.nextInt();
        
            //check input
            while(userSelection != 1 && userSelection != 2){
                System.out.print("\n!! wrong input !! "
                    + "--------------------------------------------------"
                    + "\nchoose an action: "
                    + "\n> 1- List of available medical devices "
                    + "\n> 2- Add a specific need"
                    + "\n> 3- Search for a product "
                    + "\n------------------------------------------------------\n");
                userSelection = input2.nextInt();
            }
            if(userSelection == 1){
                list_of_devices list=new list_of_devices();
                list.available_devices_list();
            }
         
            else if(userSelection == 2){
                specificNeed();
            }
         
          
            else if(userSelection == 3){
                specificNeed();
            }
        }catch(Exception e){
           System.out.println("wrong input!!!!!");
        } 
              
           
        break; 
        
       case 3:
            exit(0);
           
          break;

       default:
        System.out.print("Invalid Choice ");
        System.out.print("Try Again\n");
                                                                                                      
        }
    
    }
     while (choice != 3);
     
    
    }
    }
    
     public static void detailOfDonate(){
        Scanner input = new Scanner(System.in);
        String name, status, type,description;
        int duration = 0;
        
        
        System.out.print("\nEnter the name of the device: ");
        name = input.nextLine();
        
        System.out.print("Device status (used or new):");
        status = input.nextLine();
        while(!status.equalsIgnoreCase("used") && !status.equalsIgnoreCase("new")){
            System.out.print("!!try aging!! \nDevice status (used or new):");
            status = input.nextLine();
        }
        
        if(status.equalsIgnoreCase("used")){
            System.out.print("Device usage time in years: ");
            duration = input.nextInt();
            String line;
            line = input.nextLine();
        }
        
        System.out.print("Device type (electronic or normal): ");
        type = input.next();
        
        System.out.print("Device description: ");
        description = input.nextLine();
        
        device addDevice = new device(name,status,type,duration,description);
        try{
        addDevice.addDevice();
        System.out.println("\ndevice successfully added. "
                + "\nWe will contact you to set a date for receiving the device");
        }catch(Exception e){
            System.out.println("\nThere was an error. Try later");
        }
        
    }
     
     public static void specificNeed(){
         
        Scanner input = new Scanner(System.in);
        String name,description,address;
        int number=0, id=0;
        
        try{
            System.out.print("\nEnter your National Identity number: ");
            id = input.nextInt();
          }catch(Exception e){
              System.out.println("\n!!wrong input!!"
                             + "\nNational Identity consist of 10 integer");
          }  
        
        
        System.out.print("\nEnter the name of the device you need: ");
        name = input.next();
       
        System.out.print("Device description: ");
        description = input.next();
      
         System.out.print("Enter the address where the order will be delivered: ");
        address= input.next();
        
        
        try{
            System.out.print("contact phone number: ");
            number = input.nextInt();
       }catch(Exception e){
            System.out.println("\n!!!wrong input!!!!\nphone number must be intger");
        }
        
       
        
        if(id != 0 && number !=0){ 
        
        Specific_Need addNeeds = new Specific_Need( name, description,  address,  id, number);
        try{
        addNeeds.specificNeed();
        System.out.println("\nYour specific need successfully added. "
                + "\nWe will contact you to tell you if your request accepted or rejected");
        }catch(Exception e){
            System.out.println("\nThere was an error. Try later");
        }
        }else{
            System.out.println("\nThere was an error"
                    + " in your National Identity number or phone number . \nTry later");
        }
     }
     
    

}
