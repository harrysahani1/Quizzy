/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author harry sahani
 */
public class Rule extends JFrame implements ActionListener{
    JButton start;
    String username;
    Rule(String username){
        this.username = username;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
         
        JLabel fill = new JLabel("Welcome " + username + " into rule book");
        fill.setBounds(70,50,700,30);
        fill.setFont(new Font("Viner Hand ITC", Font.BOLD,28));
        fill.setForeground(Color.blue);
        add(fill);
        
        JLabel rules = new JLabel();
        rules.setBounds(20,80,700,350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,12));
        add(rules);
        
        rules.setText(
            "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
            "<html>"
            );
        
        
        start = new JButton("Start");
        start.setBounds(260,400,120,30);
        start.setBackground(new Color(133,145,170));
        start.setForeground(Color.white);
        start.setFont(new Font("Times New Roman", Font.BOLD,12));
        start.setBorder(new LineBorder(new Color(133,145,170)));
        start.setFocusPainted(false);
        start.addActionListener(this);
        add(start);
        
        
        setSize(800,550);
        setLocation(350,100);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== start){
            setVisible(false);
            new Loading();
        }
        
    }
    
    public static void main(String[] args) {
        new Rule("User");
    }

    
}
