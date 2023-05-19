package donationproject;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Specific_Need {
    private  String name,description,address;
    private  int number, id;
    
    public Specific_Need(String name, String description, String address, int id,int number){
        this.name = name;
        this.description = description;
        this.address =address ;
        this.id=id;
        this.number=number;
    }
    
    public String specificNeed(String name, String description, String address, int id,int number){
        String ListOfNeeds;
        
        
                              ListOfNeeds = "------------------------"+"\n"+
					"ID Number\t"+id+"\n"+

					"Device Name\t\t"+name+"\n"+
					
					"Device description\t"+description+"\n"+
					
					"Phone number\t\t"+number+"\n"+
					
                                        "------------------------";
					
        
        return ListOfNeeds;
    }
    
    public void specificNeed() throws IOException {
        try{
        FileWriter  sp= new FileWriter("specificNeeds.txt", true);
        PrintWriter specificNeeds = new PrintWriter(sp); 
        
        specificNeeds.println(specificNeed(name,description,address,id,number));
        
        specificNeeds.close(); //close file
        }catch(Exception e){
            
        }
    }
}
