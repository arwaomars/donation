package lifeindonation;

//this class for connect code with Data Base

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class  DataBase {
    
    private final String host ="root";
    private final String password ="";
    private final String address ="jdbc:mysql://localhost/LifeInDonationDataBase";
    
    public Connection connect()throws SQLException{
        return DriverManager.getConnection(address, host, password);
    }
    
    
    
}

