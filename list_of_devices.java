package donationproject;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class list_of_devices {
    
    public void available_devices_list() throws IOException{
    
        try{
        File showList = new File("device.txt");
        Scanner Records = new Scanner(showList); 
        
        System.out.println("\nThe available devices are: ");
     
        while(Records.hasNext()){
            //read the file data
            String line =Records.nextLine();
            System.out.println(line);
        }
        //close the file
        Records.close();

        }catch(Exception e){
            System.out.println("There is no Devices");
        } 
            
    } 
    
}
