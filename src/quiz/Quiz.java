
package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Quiz extends JFrame implements ActionListener{
    
    JButton login,signup, demo;
    
    Quiz(){
        
        JPanel jp= new JPanel();
        jp.setLayout(null);
        jp.setBackground(new Color(69,69,69));
        jp.setBounds(0,0,1350,50);
        add(jp);
        
        ImageIcon img4=new ImageIcon(ClassLoader.getSystemResource("image/image1.png"));
        Image img5 =img4.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon img6=new ImageIcon(img5);
        JLabel img7= new JLabel(img6);
        img7.setBounds(5,5,40,40);
        jp.add(img7);
        
        
        setBounds(0,0,1350,800);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image2.jpg"));
        Image img2 =img1.getImage().getScaledInstance(1350, 800, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,1600,800);
        add(img);
        
        JLabel dashboard = new JLabel("<html>Organize Live Multiplayer<br/>Trivia Quiz for Your Event!</html>");
        dashboard.setBounds(700,200,500,100);
        dashboard.setFont(new Font("Times New Roman", Font.BOLD,40));
        dashboard.setForeground(Color.white);
        img.add(dashboard);
        
        login = new JButton("Login");
        login.setBackground(new Color(173, 216, 230));
//        login.setForeground(Color.white);
        login.setFont(new Font("Times New Roman", Font.BOLD,12));
        login.setBounds(1100,10,100,30);
        login.setFocusPainted(false);
        login.addActionListener(this);

        jp.add(login);
        
        signup = new JButton("Signup");
        signup.setBackground(new Color(173, 216, 230));
//        login.setForeground(Color.white);
        signup.setFont(new Font("Times New Roman", Font.BOLD,12));
        signup.setBounds(1230,10,100,30);
        signup.setFocusPainted(false);
        signup.addActionListener(this);
        jp.add(signup);

        
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== login){
            new Login();
                    
        }else if(ae.getSource()==signup){
            new Signup();
        }
        
    }
 
    public static void main(String[] args) {
        new Quiz();
        
    }
    
}
