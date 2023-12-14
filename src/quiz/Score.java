/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
import javax.swing.border.LineBorder;

/**
 *
 * @author harry sahani
 */
public class Score extends JFrame{
    JLabel qno,qno1;
    JButton next;
    
    Score(String username, int score) {
        setBounds(200,70,900,600);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image10.jpg"));
        Image img2 =img1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,900,600);
        add(img);
        
        
        qno = new JLabel("Thanks You " + username + " for giving quiz");
        qno.setBounds(100,200,500,30);
        qno.setFont(new Font("Tohma", Font.BOLD,24));
        qno.setForeground(Color.black);
        img.add(qno);

        qno1 = new JLabel("Your score is " + score);
        qno1.setBounds(100,300,500,30);
        qno1.setFont(new Font("Tohma", Font.BOLD,24));
        qno1.setForeground(Color.black);
        img.add(qno1);
        

        
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Score("user", 0);
    }
}
