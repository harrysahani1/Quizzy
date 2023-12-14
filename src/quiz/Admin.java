/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author harry sahani
 */
public class Admin extends JFrame implements ActionListener{
    JButton submit,back ;
    JTextField txt,txt1,txt2,txt3;
    Choice security;
    String username;
    Admin(String username){
    this.username = username;
    setBounds(300,100,900,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image11.jpg"));
        Image img2 =img1.getImage().getScaledInstance(900, 550, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,900,550);
        add(img);
        
        
        JLabel fill = new JLabel("Fill The From");
        fill.setBounds(150,5,300,125);
        fill.setFont(new Font("Times New Roman", Font.BOLD,25));
        fill.setForeground(Color.RED);
        img.add(fill);
        
        
        
        JLabel username1 = new JLabel("Name :-");
        username1.setBounds(100,120,125,25);
        username1.setFont(new Font("Times New Roman", Font.BOLD,12));
        username1.setForeground(Color.white);
        img.add(username1);
        txt = new JTextField();
        txt.setBounds(200,120,180,25);
        txt.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt);
        
        JLabel name = new JLabel("Email :-");
        name.setBounds(100,160,125,25);
        name.setFont(new Font("Times New Roman", Font.BOLD,12));
        name.setForeground(Color.white);
        img.add(name);
        txt1 = new JTextField();
        txt1.setBounds(200,160,180,25);
        txt1.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt1);
        
        JLabel password = new JLabel("Mobile_no. :-");
        password.setBounds(100,200,125,25);
        password.setFont(new Font("Times New Roman", Font.BOLD,12));
        password.setForeground(Color.white);
        img.add(password);
        txt2 = new JTextField();
        txt2.setBounds(200,200,180,25);
        txt2.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt2);
        
       
        JLabel sec = new JLabel("Gender :-");
        sec.setBounds(100,240,100,25);
        sec.setFont(new Font("Times New Roman", Font.BOLD,12));
        sec.setForeground(Color.white);
        img.add(sec);
        
        security = new Choice();
        security.add("Male");
        security.add("Female");
        security.add("TransGender");
        security.setBounds(200,240,180,25);
        img.add(security);
        
        
        JLabel ans = new JLabel("Address :-");
        ans.setBounds(100,280,125,25);
        ans.setFont(new Font("Times New Roman", Font.BOLD,12));
        ans.setForeground(Color.white);
        img.add(ans);
        txt3 = new JTextField();
        txt3.setBounds(200,280,180,25);
        txt3.setBorder(BorderFactory.createEmptyBorder());
        img.add(txt3);
        
        submit = new JButton("Submit");
        submit.setBackground(new Color(220,220,200));
        submit.setForeground(new Color(69,69,69));
        submit.setFont(new Font("Times New Roman", Font.BOLD,12));
        submit.setBounds(130,350,100,30);
        submit.addActionListener(this);
        img.add(submit);
        
        back = new JButton("Skip");
        back.setBackground(new Color(220,220,200));
        back.setForeground(new Color(69,69,69));
        back.setFont(new Font("Times New Roman", Font.BOLD,12));
        back.setBounds(260,350,100,30);
        back.addActionListener(this);
        img.add(back); 
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String name = txt.getText();
            String email = txt1.getText();
            String mobile_no = txt2.getText();
            String gender = security.getSelectedItem();
            String address = txt3.getText();
            
            String query = "insert into admin values( '"+name+"','"+email+"','"+mobile_no+"','"+gender+"','"+address+"')";
            
            try {
                Conn c= new Conn();
                c.st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "data submited successfull");
                setVisible(false);
                new Dashboard(username);
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }else if(ae.getSource()==back){
            setVisible(false);
            new Dashboard("username");
        }
        
    }
    public static void main(String[] args) {
        new Admin("user");
        
    }
}
