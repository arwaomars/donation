package donation;

import java.util.Scanner;
import static java.lang.System.exit;

public class Donor extends User{
    
    
    public Donor(int id,String FN,String MN,String SN,int phone,String address, String email)
    {
        super(id,FN,MN,SN,phone,address,email);
        add_donor_ToDataBase();
        this.id = id;
        displayService();
    }
    
    public void displayService(){
       Scanner input = new Scanner(System.in); 
       
       donorService service= new donorService();
       int userSelection = 0;
       do{
            System.out.println("-------------------------------------------------"
                + "\nChoose a Service: "
                + "\n> 1- List of needs "
                + "\n> 2- Device donation"
                + "\n> 3- exit"
                + "\n-------------------------------------------------");
        
            try{
                userSelection = input.nextInt();
       
                //check input
                while(userSelection != 1 && userSelection != 2){
                System.out.println("!! wrong input !! \n"
                    + "-------------------------------------------------"
                    + "\nChoose a Service: "
                    + "\n> 1- List of needs "
                    + "\n> 2- Device donation"
                    + "\n> 3- exit"
                    + "\n-------------------------------------------------");
                userSelection = input.nextInt();
                }
                
                
            if(userSelection == 1){
                service.ListOfNeed();
            }   
            else if(userSelection == 2){
                service.DetailOfDonate(id);
            }
            else if(userSelection == 3){
                exit(0);
            }
            
            }catch(Exception e){
                System.out.println("!!!wrong input!!!");
            }
        
       }while(userSelection == 1 && userSelection == 2);
    }
}