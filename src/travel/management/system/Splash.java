
package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;

public class Splash {
    public static void main(String[] args){
        SplashFrame f1 = new SplashFrame();
        f1.setVisible(true);
        
        int x=1;
        for(int i=2; i<=600; i+=10, x+=7)
        {
            f1.setLocation(650 - ((i+x)/2), 350 - (i/2));
            f1.setSize(i+x,i);
            try{
                Thread.sleep(10);
            }
            catch(Exception e){} 
        }
    }
    
}
class SplashFrame extends JFrame implements Runnable{
Thread t1;
    SplashFrame(){
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/splash.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1030, 750,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel l1 = new JLabel(i2);
        add(l1);
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            Login l = new Login();
            l.setVisible(true);
           
        }catch(Exception e)
        {
            e.printStackTrace();
        }
            
    }
}
