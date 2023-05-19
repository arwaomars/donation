package donationproject;



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class device {
    private String name, status, type,description;
    private int duration;
    
    public device(String name, String status, String type, int duration,String description){
        this.name = name;
        this.status = status;
        this.type = type;
        this.duration =duration;
        this.description=description;
    }

    
    public String deviceDetail(String name, String status, String type, int duration){
        String Detail;
        if(duration != 0){
            Detail = "Device name: " +name+ " | " 
                   + "Device type: " +type+ " | "
                   + "Device status: " +status+ " | "
                   + "Device usage time in years: " +duration+" | "
                   + "Device description: "+description;
        }else{
            Detail = "Device name: " +name+ " | " 
                   + "Device type: " +type+ " | "
                   + "Device status: " +status+" | "
              + "Device description: "+description;
        }
        return Detail;
    }
    
    public void addDevice() throws IOException {
        try{
        FileWriter listDevice = new FileWriter("device.txt", true);
        PrintWriter availableDevices = new PrintWriter(listDevice); 
        
        availableDevices.println(deviceDetail(name,status,type,duration));
        
        availableDevices.close(); //close file
        }catch(Exception e){
            
        }
    }
}