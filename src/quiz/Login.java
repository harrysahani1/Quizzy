
package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Login extends JFrame implements ActionListener{
    JButton login,forget;
    JTextField txt,txt1;
    Login(){

        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image4.jpg"));
        Image img2 =img1.getImage().getScaledInstance(1350, 700, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,1350,700);
        add(img);
        
        ImageIcon img4=new ImageIcon(ClassLoader.getSystemResource("image/image5.jpg"));
        Image img5 =img4.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon img6=new ImageIcon(img5);
        JLabel img7= new JLabel(img6);
        img7.setBounds(450,150,500,500);
        img.add(img7);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("image/login.png"));
        Image i2 =i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4= new JLabel(i3);
        i4.setBounds(200,60,100,100);
        img7.add(i4);
        
        JLabel fill = new JLabel("Login");
        fill.setBounds(650,10,300,130);
        fill.setFont(new Font("Times New Roman", Font.BOLD,60));
        fill.setForeground(Color.black);
        img.add(fill);
        
        
        JLabel user = new JLabel("USERNAME  :- ");
        user.setBounds(100,200,300,30);
        user.setFont(new Font("Times New Roman", Font.BOLD,15));
        img7.add(user);
        
        txt = new JTextField();
        txt.setBounds(230,200,200,30);
        txt.setBorder(BorderFactory.createEmptyBorder());
        img7.add(txt);
        
        
        JLabel pass = new JLabel("PASSWORD  :- ");
        pass.setBounds(100,250,300,30);
        pass.setFont(new Font("Times New Roman", Font.BOLD,15));
        img7.add(pass);
        
        txt1 = new JTextField();
        txt1.setBounds(230,250,200,30);
        txt1.setBorder(BorderFactory.createEmptyBorder());
        img7.add(txt1);
        
        login = new JButton("Login");
        login.setBounds(150,350,100,30);
        login.setBackground(new Color(133,145,170));
        login.setForeground(Color.white);
        login.setFont(new Font("Times New Roman", Font.BOLD,12));
        login.setBorder(new LineBorder(new Color(133,145,170)));
        login.setFocusPainted(false);
        login.addActionListener(this);
        img7.add(login);
        
        forget = new JButton("Forget Password");
        forget.setBounds(260,350,120,30);
        forget.setBackground(new Color(133,145,170));
        forget.setForeground(Color.white);
        forget.setFont(new Font("Times New Roman", Font.BOLD,12));
        forget.setBorder(new LineBorder(new Color(133,145,170)));
        forget.setFocusPainted(false);
        forget.addActionListener(this);
        img7.add(forget); 
        
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()== login){
            try {
                String username = txt.getText();
                String password = txt1.getText();
                
               String query ="Select * from signup where password = '"+password+"' AND user = '"+username+"' ";
               Conn c= new Conn();
               ResultSet rs = c.st.executeQuery(query); 
                 if(rs.next()){
                   setVisible(false);
                   new Rule(username);
               }else{
                   JOptionPane.showMessageDialog(null, "Username or password is incorrect");
               }
               
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else{
            setVisible(false);
            new ForgetPassword();
        }
        
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
