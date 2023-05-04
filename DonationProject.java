package donationproject;

import java.io.IOException;
import java.util.*;

/**
 * @author arwao
 */

public class DonationProject {
     

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in); 
        System.out.println("welcome in life in Donation app\n");
        System.out.print("1- Donor \n2- Those in need \nplease enter the number that represent you: ");
        int UserType = input.nextInt();
        
        //check input
        while(UserType != 1 && UserType != 2){
            System.out.print("\n!! wrong input !!"
                    + "\n1- Donor "
                    + "\n2- Those in need "
                    + "\nplease enter the number that represent you: ");
            UserType = input.nextInt();
        }
        
        if(UserType == 1){
            donor();
        }else{
            thoseInNeed();
        }
    }
    
    
    public static void donor(){
        Scanner input = new Scanner(System.in); 
        System.out.print("\n1- List of need "
                + "\n2- Display what to donate "
                + "\nPlease enter the number of what you want: ");
        int userSelection = input.nextInt();
        
        //check input
         while(userSelection != 1 && userSelection != 2){
            System.out.print("\n!! wrong input !! "
                    + "\n1- List of need "
                    + "\n2- Display what to donate "
                    + "\nPlease enter the number of what you want: ");
            userSelection = input.nextInt();
        }
         
        if(userSelection == 2){
            detailOfDonate();
        }
    }
    
    public static void detailOfDonate(){
        Scanner input = new Scanner(System.in);
        String name, status, type;
        int duration = 0;
        
        System.out.print("\nEnter the name of the device: ");
        name = input.nextLine();
        
        System.out.print("used or new: ");
        status = input.nextLine();
        
        if(status.equalsIgnoreCase("used")){
            System.out.print("Device usage time in years: ");
            duration = input.nextInt();
            String line;
            line = input.nextLine();
        }
        
        System.out.print("electronic or normal: ");
        type = input.next();
        
        device addDevice = new device(name,status,type,duration);
        try{
        addDevice.addDevice();
        System.out.println("\ndevice successfully added. "
                + "\nWe will contact you to set a date for receiving the device");
        }catch(Exception e){
            System.out.println("\nThere was an error. Try later");
        }
    }
    
    public static void thoseInNeed() throws IOException{
        
        Scanner input = new Scanner(System.in); 
        System.out.print("\n1- List of available medical devices. "
                + "\n2- Add a specific need. "
                + "\nPlease enter the number of what you want: ");
        int userSelection = input.nextInt();
        
        //check input
         while(userSelection != 1 && userSelection != 2){
            System.out.print("\n!! wrong input !! "
                    + "\n1- List of available medical devices. "
                    + "\n2- Add a specific need. "
                    + "\nPlease enter the number of what you want: ");
            userSelection = input.nextInt();
         }
         if(userSelection == 1){
            list_of_devices list=new list_of_devices();
            list.available_devices_list();
         }
         
    }
    
}
