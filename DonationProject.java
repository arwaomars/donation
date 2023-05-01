package donationproject;

import java.util.*;

/**
 * @author arwao
 */

public class DonationProject {
     

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("welcome in life in Donation app\n");
        System.out.print("""
                         1- Donor 
                         2- Those in need 
                         please enter the number that represent you: """);
        int UserType = input.nextInt();
        
        //check input
        while(UserType != 1 && UserType != 2){
            System.out.print("""
                             
                             !! wrong input !!
                             1- Donor 
                             2- Those in need
                             please enter the number that represent you: """);
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
        System.out.println("""
                              
                           1- List of need
                           2- Display what to donate
                           Please enter the number of what you want: """);
        int userSelection = input.nextInt();
        
        //check input
         while(userSelection != 1 && userSelection != 2){
            System.out.print("""
                             
                             !! wrong input !!
                             1- List of need
                             2- Display what to donate
                             Please enter the number of what you want: """);
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
        
        System.out.println("Enter the name of the device: ");
        name = input.nextLine();
        
        System.out.println("used or new: ");
        status = input.nextLine();
        
        if(status.equalsIgnoreCase("used")){
            System.out.println("Duration of use:");
            duration = input.nextInt();
        }
        
        System.out.println("electronic or normal:");
        type = input.next();
        
        device addDevice = new device(name,status,type,duration);
        try{
        addDevice.addDevice();
        System.out.println("""
                           device successfully added.
                            We will contact you to set a date for receiving the device""");
        }catch(Exception e){
            System.out.println("There was an error. Try later");
        }
    }
    
    public static void thoseInNeed(){
        Scanner input = new Scanner(System.in); 
        System.out.println("""
                           1- List of available medical devices.
                           2- Add a specific need. 
                           Please enter the number of what you want: """);
        int userSelection = input.nextInt();
        
        //check input
         while(userSelection != 1 && userSelection != 2){
            System.out.print("""
                             
                             !! wrong input !!
                             1- List of available medical devices.
                             2- Add a specific need. 
                             Please enter the number of what you want: """);
            userSelection = input.nextInt();
         }
         
         
    }
    
}
