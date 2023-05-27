package lifeindonation;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
    
     int id;
     String first_name, middle_name, surname;
     int phone_number, age;
     String email, address;
    
    
    static Connection PiN_Connection; 
    static Connection donor_Connection; 
    static Statement statement;
    DataBase conn = new DataBase();
    static String query;
    
    ///////////////////constructors///////////////////
    //1
    public User(){}    
    
    //2 
    public User(int id,String FN,String MN,String SN,int phone,String address, String email)
    {
        this.id=id;
        this.first_name=first_name;
        this.middle_name=middle_name;
        this.surname=surname;
        this.phone_number=phone_number;
        this.address=address;
        this.email = email;
    }
    
    
    ////////////////////////////set & get methods////////////////////////////
    public void setID(int id){
        this.id =id; 
    }
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }
    public void setMiddle_name(String middle_name){
        this.middle_name = middle_name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setPhone_number(int phone_number){
        this.phone_number = phone_number;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setEmail(String e){
        this.email = e;
    }
    
    
    public int getID(){
        return id;  
    }
    public String getFirst_name(){
        return first_name;
    }
    public String getMiddle_name(){
        return middle_name;
    }
    public String getSurname(){
        return surname;
    }
    public int getPhone_number(){
        return phone_number;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
    public String setEmail(){
        return email;
    }
    
    
    
    ////////////////////////////create table methods////////////////////////////
    //PiN = Person in need
    public void create_PiN_table(){
        
        try
        {  
            PiN_Connection = conn.connect(); 
            statement = PiN_Connection.createStatement(); 
            
            query = "create table person_in_need(" 
                + "National_Identity int(10) not null," 
                + "first_name varchar(20) not null," 
                + "middle_name varchar(20)," 
                + "surname varchar(20) not null," 
                + "phone_number int not null," 
                + "email varchar(100) not null," 
                + "address varchar(40) not null," 
                + "constraint pk_person_in_need primary key (National_Identity)" 
                + ")";
        
            statement.execute(query);
        
        }catch(Exception e){ 
            System.out.println(e.getMessage());
        }finally{
            try{
                    PiN_Connection.close();
                statement.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//end method
    
    
    public void create_donor_table(){
        
        try
        {  
            donor_Connection = conn.connect(); 
            statement = donor_Connection.createStatement(); 
            
             query = "create table donor(" 
                + "National_Identity int(10) not null," 
                + "first_name varchar(20) not null," 
                + "middle_name varchar(20)," 
                + "surname varchar(20) not null," 
                + "phone_number int not null," 
                + "email varchar(100) not null," 
                + "address varchar(40) not null," 
                + "constraint pk_person_in_need primary key (National_Identity)" 
                + ")";
        
        
            statement.execute(query);
        
        }catch(Exception e){ 
            System.out.println(e.getMessage());
        }finally{
            try{
                donor_Connection.close(); 
                statement.close();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//end method
    
    
    
    
    
    
    
    
    ///////////////////////add info of user in data base///////////////////////
    public void add_Pin_ToDataBase(){
        
        try
        {  
        PiN_Connection = conn.connect(); 
        
        statement =PiN_Connection.createStatement(); 
        String query ="insert into person_in_need values("
                + "'"+id+"',"
                + "'"+first_name+"',"
                + "'"+middle_name+"',"
                + "'"+surname+"',"
                + "'"+phone_number+"',"
                + "'"+email+"',"
                + "'"+address+"')";
        
        statement.execute(query);
        
        }catch(SQLException e){ 
            System.out.println(e.getMessage());
            
        }finally{
            try{
                PiN_Connection.close();
                statement.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }//end method
    
    
    public void add_donor_ToDataBase(){
        
        try
        {  
        donor_Connection = conn.connect(); 
        
        statement =donor_Connection.createStatement(); 
        String query ="insert into donor values("
                + "'"+id+"',"
                + "'"+first_name+"',"
                + "'"+middle_name+"',"
                + "'"+surname+"',"
                + "'"+phone_number+"',"
                + "'"+email+"',"
                + "'"+address+"',"
                + "'"+age+"')";
        
        statement.execute(query);
        
        }catch(SQLException e){ 
            System.out.println(e.getMessage());
            
        }finally{
            try{
                donor_Connection.close();
                statement.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }//end method
    
}