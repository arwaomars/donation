package donationproject;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Jana
 */
public class List_of_needs {
    public void available_needs_list() throws IOException{
    
        try{
        File needs = new File("specificNeeds.txt");
        Scanner Records = new Scanner(needs); 
        
        System.out.println("\nThe available needs are: ");
     
        while(Records.hasNext()){
            //read the file data
            String line =Records.nextLine();
            System.out.println(line);
        }
        //close the file
        Records.close();

        }catch(Exception e){
            System.out.println("There is no needs yet");
        } 
        
    }

}
