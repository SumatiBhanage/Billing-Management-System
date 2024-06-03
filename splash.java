
package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
public class splash extends JFrame implements Runnable{
    Thread t;
    splash(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/screen.jpg"));
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        setSize(730, 550);
        setLocation(350, 150);
        
        t=new Thread(this);
        t.start();
        
        setVisible(true);
        
        
    }
    
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            
            // login frame
            new login();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
   
    public static void main(String[] args){
        new splash();
    }
            
    
}
