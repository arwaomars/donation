package donationproject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class device {
    private String name, status, type;
    private int duration;
    
    public device(String name, String status, String type, int duration){
        this.name = name;
        this.status = status;
        this.type = type;
        this.duration =duration;
    }
    
    public String deviceDetail(String name, String status, String type, int duration){
        String Detail;
        if(duration != 0){
            Detail = "Device name: " +name+ " | " 
                   + "Device type: " +type+ " | "
                   + "Device status: " +status+ " | "
                   + "Duration of use:: " +duration;
        }else{
            Detail = "Device name: " +name+ " | " 
                   + "Device type: " +type+ " | "
                   + "Device status: " +status;
        }
        return Detail;
    }
    
    public void addDevice() throws IOException {
        try{
        FileWriter listDevice = new FileWriter("arwa.txt", true);
        PrintWriter availableDevices = new PrintWriter(listDevice); 
        
        availableDevices.println(deviceDetail(name,status,type,duration));
        
        availableDevices.close(); //close file
        }catch(Exception e){
            
        }
    }
}

