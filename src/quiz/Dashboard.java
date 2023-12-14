/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author harry sahani
 */
public class Dashboard extends JFrame implements ActionListener{
    JButton java,html,python, c, cplus, exit, sql,details;
    String username;
    Dashboard(String username){
        this.username = username;
        setBounds(0,0,1600,800);
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image9.jpg"));
        Image img2 =img1.getImage().getScaledInstance(1600, 800, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,1600,800);
        add(img);
        
        JPanel jp= new JPanel();
        jp.setLayout(null);
        jp.setBackground(new Color(255, 165, 0));
        jp.setBounds(0,0,1600,50);
        img.add(jp);
        
        
        java = new JButton("JAVA");
        java.setBounds(5,5,100,40);
        java.setBackground(new Color(10,10,230));
        java.setForeground(Color.white);
        java.setFont(new Font("Times New Roman", Font.BOLD,15));
        java.setFocusPainted(false);
        java.addActionListener(this);
        jp.add(java);
        
        html = new JButton("HTML");
        html.setBounds(120,5,100,40);
        html.setBackground(new Color(10,10,230));
        html.setForeground(Color.white);
        html.setFont(new Font("Times New Roman", Font.BOLD,15));
        html.setFocusPainted(false);
        html.addActionListener(this);
        jp.add(html);
        
        python = new JButton("Python");
        python.setBounds(240,5,100,40);
        python.setBackground(new Color(10,10,230));
        python.setForeground(Color.white);
        python.setFont(new Font("Times New Roman", Font.BOLD,15));
        python.setFocusPainted(false);
        python.addActionListener(this);
        jp.add(python);
        
        c = new JButton("C");
        c.setBounds(360,5,100,40);
        c.setBackground(new Color(10,10,230));
        c.setForeground(Color.white);
        c.setFont(new Font("Times New Roman", Font.BOLD,15));
        c.setFocusPainted(false);
        c.addActionListener(this);
        jp.add(c);
        
        
        cplus = new JButton("C++");
        cplus.setBounds(480,5,100,40);
        cplus.setBackground(new Color(10,10,230));
        cplus.setForeground(Color.white);
        cplus.setFont(new Font("Times New Roman", Font.BOLD,15));
        cplus.setFocusPainted(false);
        cplus.addActionListener(this);
        jp.add(cplus);
        
        
        sql = new JButton("MYSQL");
        sql.setBounds(600,5,100,40);
        sql.setBackground(new Color(10,10,230));
        sql.setForeground(Color.white);
        sql.setFont(new Font("Times New Roman", Font.BOLD,15));
        sql.setFocusPainted(false);
        sql.addActionListener(this);
        jp.add(sql);
        
        
        exit = new JButton("Exit");
        exit.setBounds(1250,5,100,40);
        exit.setBackground(new Color(10,10,230));
        exit.setForeground(Color.white);
        exit.setFont(new Font("Times New Roman", Font.BOLD,15));
        exit.setFocusPainted(false);
        exit.addActionListener(this);
        jp.add(exit);
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== java){
            new Java(username);
        }
        else if(ae.getSource()== html){
            new Html(username);
        }
        else if(ae.getSource() == python){
            new Python(username);
        }
        else if(ae.getSource() == c){
            new C(username);
        }
        else if(ae.getSource() == cplus){
            new Cplus(username);
        }
        else if(ae.getSource()== sql){
            new Sql(username);
        }
        else if(ae.getSource() == exit){
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
       new Dashboard("user");
    }
    
    
}
