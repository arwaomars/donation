
package donation;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PersonInNeed_Service {
    
        Scanner input = new Scanner(System.in); 
        static ResultSet r;
        static Statement ss;
        static String query;
        static Connection c,cn;
        DataBase conn = new DataBase();
    
//////////////////////////////PersonInNeed service//////////////////////////////
    
    //1 (List of available device)
    public void ListOfAvailableDevice(){
    
        System.out.println("\nList Of Available device: ");
      
        
        try{
            c = conn.connect();
            ss = c.createStatement();
            query = "select * from donated_devices";
            r = ss.executeQuery(query);
            int count = 0;
            while(r.next()){
                count++;
                System.out.println(count+":");
                System.out.println("id: "+r.getInt("National_Identity_of_donor"));
                System.out.println("name: "+r.getString("Device_name"));
                System.out.println("type: "+r.getString("Device_type"));
                System.out.println("status: " + r.getString("Device_status"));
                System.out.println("duration use: " + r.getString("Device_usage_time"));
                System.out.println("description: " + r.getString("Device_description"));
                System.out.println("number_of_devices: " + r.getString("number_of_devices"));
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
    
    
    //2 (Add Specific Need)
    public void specificNeed(int id){
         
        Scanner input = new Scanner(System.in);
        String name,description,address;
            
        System.out.print("\nEnter the name of the device: ");
        name = input.nextLine();
        
        
        System.out.print("Device type (electronic or normal): ");
        String type = input.next();
        
        System.out.print("number of Devices needed: ");
        int nd = input.nextInt();
        
        System.out.print("Device description: ");
        input.nextLine(); //because it count enter button
        description = input.nextLine();
        
        
            device add = new device(name, type, description , id,  nd);
            try{
                add.create_needed_device_table();
                add.add_need_device();
            
            }catch(Exception e){
                System.out.println("\nThere was an error. Try later");
            }
    }
     
    
     //3 (SearchToOrder)
  public void SearchToOrder(){
    
        System.out.println("\nEnter yhe name of the device: ");
        Scanner scan = new Scanner(System.in);
         String search=scan.nextLine();

        
        try{
            c = conn.connect();
            ss = c.createStatement();
            query = "select * from donated_devices WHERE Device_name Like'"+search+"'";
            r = ss.executeQuery(query);
            int count = 0;
            while(r.next()){
                count++;
                System.out.println(count+":");
                System.out.println("id: "+r.getInt("National_Identity_of_donor"));
                System.out.println("name: "+r.getString("Device_name"));
                System.out.println("type: "+r.getString("Device_type"));
                System.out.println("status: " + r.getString("Device_status"));
                System.out.println("duration use: " + r.getString("Device_usage_time"));
                System.out.println("description: " + r.getString("Device_description"));
                System.out.println("number_of_devices: " + r.getString("number_of_devices"));
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