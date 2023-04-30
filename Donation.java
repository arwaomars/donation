package donation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author arwao
 */

public class Donation extends JFrame{
        JLabel l0 = new JLabel("Welcome to life in donation !");
        
        JLabel l1= new JLabel("Your: ");
        JButton button1 = new JButton( "Donor");
        JButton button2 = new JButton("those in need");
        
        JPanel panel1 = new JPanel();
        
    public Donation(){
        
        setSize(200,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Life in Donation");
        
        
        button1.setBackground(Color.BLUE);
        button1.setForeground(Color.WHITE);
        button1.addActionListener(new DonorAction());
        button2.addActionListener(new InNeedAction());

        button2.setBackground(Color.GREEN);
        button2.setForeground(Color.black);
        
        
        panel1.add(l0); 
        
        panel1.add(button1);
        panel1.add(button2);
        
        
        add(panel1);
        
        //add(button1);
        //add(button2);
        
        setVisible(true);
    }
    
    //////////////////DonorAction///////////////////////////
    private class DonorAction implements ActionListener
 {
   public void actionPerformed(ActionEvent e)
   {
        JFrame d=new JFrame();
        d.setTitle("Donor Page");
        d.setSize(200,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel P1=new JPanel();
        JLabel L0 =new JLabel("Choose The Service:");
        JButton b1 = new JButton("Add Medical Device");
        JButton b2 = new JButton("List of Medical Device");
        b1.setBackground(Color.decode("#6F85BE"));
        b1.setForeground(Color.decode("#293561"));
        b2.setBackground(Color.decode("#6F85BE"));
        b2.setForeground(Color.decode("#293561"));
        P1.add(L0);
        P1.add(b1);
        P1.add(b2);
        d.add(P1);
        d.setVisible(true);
        b1.addActionListener(new Add_DeviceAction());
        b2.addActionListener(new list_of_devices());
   
   }
         

   private class Add_DeviceAction implements ActionListener
 {
   public void actionPerformed(ActionEvent e)
   {
         JFrame add=new JFrame();
         add.setTitle("Donor Page");
         add.setSize(200,250);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         JLabel l1 = new JLabel("The Device Name");
         JLabel l2 = new JLabel("Device Details");
         l1.setForeground(Color.decode("#293561"));
         l2.setForeground(Color.decode("#293561"));
         l1.setFont(new Font("Serif",Font.BOLD,20));
         l2.setFont(new Font("Serif",Font.BOLD,20));
         
         JTextField Dt1 = new JTextField(10);
         JTextField Dt2 = new JTextField(50);
         
         JButton b2 = new JButton("Add");
         b2.setBackground(Color.decode("#6F85BE"));
         b2.setForeground(Color.decode("#293561"));
         
         JPanel panel = new JPanel();
         panel.add(l1);
         panel.add(Dt1);
         panel.add(l2);
         panel.add(Dt2);
         panel.add(b2);
         add.add(panel);
         add.setVisible(true);

 }}}
    
      private class list_of_devices implements ActionListener
 {
   public void actionPerformed(ActionEvent e)
   {
        JFrame list=new JFrame();
        list.setTitle("List of Devices");
        list.setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        JPanel mainPanel =new JPanel();
        JPanel P1 =new JPanel();
        JPanel P2 =new JPanel();
        
        mainPanel.setBackground(Color.decode("#a9f9c5"));
        P1.setBackground(Color.decode("#3cf080"));
        P2.setBackground(Color.decode("#3cf080"));
        
       // JPanel[] devicesArray = {P1,P2};
        JLabel L1 = new JLabel("Device Name:");
        JLabel L2 = new JLabel("Device Details");
        ImageIcon image =new ImageIcon("photo.png");
        JLabel photo =new JLabel (image);
   
        JLabel L3 = new JLabel("Device Name:");
        JLabel L4 = new JLabel("Device Details");
        ImageIcon image2 =new ImageIcon("photo.png");
        JLabel photo2 =new JLabel (image);
             
        P1.add(L1);
        P1.add(L2);
        P1.add(photo);
        P2.add(L3);
        P2.add(L4);
        P2.add(photo2);
        
       // JList devicesList =new JList(devicesArray);
       // JScrollPane scroll =new JScrollPane(devicesList);
        
        L1.setForeground(Color.decode("#293561"));
        L2.setForeground(Color.decode("#293561"));
        L1.setFont(new Font("Serif",Font.BOLD,20));
        L2.setFont(new Font("Serif",Font.BOLD,15));  
        L3.setForeground(Color.decode("#293561"));
        L4.setForeground(Color.decode("#293561"));
        L3.setFont(new Font("Serif",Font.BOLD,20));
        L4.setFont(new Font("Serif",Font.BOLD,15));  

       // scroll.add(P1);
       // scroll.add(P2);
       // mainPanel.add(scroll);
        mainPanel.add(P1);
        mainPanel.add(P2);
        list.add(mainPanel);
        list.setVisible(true);

 }}
      
       public class InNeedAction implements ActionListener
 {
   public void actionPerformed(ActionEvent e)
   {
         
       JFrame add=new JFrame();
         add.setTitle("those in need Page");
         add.setSize(400,250);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         
         JLabel l1 = new JLabel("search by medical device name:");
         
         l1.setForeground(Color.decode("#293561"));
         
         l1.setFont(new Font("Serif",Font.BOLD,20));
       
         
         JTextField Dt1 = new JTextField(10);
        
         
         JButton b2 = new JButton("Search");
         b2.setBackground(Color.decode("#6F85BE"));
         b2.setForeground(Color.decode("#293561"));
         
         b2.addActionListener(new Search_DeviceAction());
         
         JPanel panel = new JPanel();
         panel.add(l1);
         panel.add(Dt1);
         panel.add(b2);
         add.add(panel);
         add.setVisible(true);
         
   }
   
           
   public class Search_DeviceAction implements ActionListener
 {
   public void actionPerformed(ActionEvent e)
   {
         JFrame add=new JFrame();
         add.setTitle("those in need Page");
         add.setSize(400,250);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         
        
         JLabel l1 = new JLabel("List of available medical devices:");
        
         l1.setForeground(Color.decode("#293561"));
        
         l1.setFont(new Font("Serif",Font.BOLD,20));
         
         
        
         
         JPanel panel = new JPanel();
         panel.add(l1);
        
         add.add(panel);
         add.setVisible(true);

 }
   }}
       
    
    public static void main(String[] args) {
        new Donation();
    }
    
}
