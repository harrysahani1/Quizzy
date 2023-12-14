
package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    
    public void run(){
        
        
        try {
           for(int i=0; i<=100; i++){
               int max = bar.getMaximum();
               int value = bar.getValue();
               
               if(value<max){
                   bar.setValue(bar.getValue()+1);
               }else{
                   new Admin("user");
                   setVisible(false);
               }
               Thread.sleep(50);
           } 
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    Loading(){
        
        t=new Thread(this);
        setBounds(350,100,800,500);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image3.jpg"));
        Image img2 =img1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,800,500);
        add(img);
        
        JLabel text = new JLabel("QUIZ MANAGEMENT SYSTEM");
        text.setBounds(150,50,500,30);
        text.setForeground(Color.RED);
        text.setFont(new Font("Times New Roman", Font.BOLD,30));
        img.add(text);
        
        bar = new JProgressBar();
        bar.setBounds(230,100,300,35);
        bar.setStringPainted(true);
        img.add(bar);
        
        JLabel loading = new JLabel("Loading Please wait......");
        loading.setBounds(280,180,180,50);
        loading.setForeground(Color.red);
        loading.setFont(new Font("Times New Roman", Font.BOLD,15));
        img.add(loading);
        
        t.start();
        
        
        setVisible(true);
        
    }
    
    
    public static void main(String[] args) {
        new Loading();
    }

    
    
}
