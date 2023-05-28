package donation;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class donorService {
    
    
        Scanner input = new Scanner(System.in); 
        static ResultSet r;
        static Statement ss;
        static String query;
        static Connection c;
        DataBase conn = new DataBase();
    
////////////////////////////////donor service///////////////////////////////////
    
    //1 (Detail of Donate)
    public void DetailOfDonate(int id){
        int duration = 0;
        
        //1
        System.out.print("\nEnter the name of the device: ");
        String name = input.nextLine();
        
        //2
        System.out.print("Device status (used or new):");
        String status = input.nextLine();
        while(!status.equalsIgnoreCase("used") && !status.equalsIgnoreCase("new")){
            System.out.print("!!try aging!! \nDevice status (used or new):");
            status = input.nextLine();
        }
        //3
        if(status.equalsIgnoreCase("used")){
            System.out.print("Device usage time in month: ");
            duration = input.nextInt();
            String line;
            line = input.nextLine();
        }
        //4
        System.out.print("Device type (electronic or normal): ");
        String type = input.next();
        //5
        System.out.print("number of Devices: ");
        int nn = input.nextInt();
        //6
        System.out.print("Device description: ");
        String description = input.nextLine();
        
        //========================================//
        
        device d = new device(name, status, type, duration, description, id, nn);
        
        try{
            d.create_donated_devices_table();
            d.add_donated_device();
            
        }catch(Exception e){
            System.out.println("\nThere was an error. Try later");
        }
        
        
    }
    
    //2 (List Of Need)
    public void ListOfNeed(){
    
        System.out.println("\nList Of device Needed: ");
        
        DataBase conn = new DataBase();
        try{
            c = conn.connect();
            ss = c.createStatement();
            
            query = "select * from needed_devices";
            r = ss.executeQuery(query);
            int count = 0;
            while(r.next()){
                count++;
                System.out.println(count+":");
                System.out.println("name: "+r.getInt("Device_name"));
                System.out.println("type: "+r.getInt("Device_type"));
                System.out.println("description: " + r.getInt("Device_description"));
                System.out.println("number_of_needs: " + r.getInt("number_of_needs"));
                System.out.println("-------------------------------------------------");
            }
           
            
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                c.close();
                ss.close();
            }catch(SQLException e2){
                System.out.println(e2.getMessage());
            }
            
        }
    }
}