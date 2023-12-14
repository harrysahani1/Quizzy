/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

/**
 *
 * @author harry sahani
 */
public class Html extends JFrame implements ActionListener{
    JLabel qno, que1;
    JRadioButton opt1,opt2,opt3,opt4;
    JButton next,lifeline,submit;
    ButtonGroup buttongroup;
    String questions [][] = new String[10][5];
    String answers[][] = new String[10][2];
    String userans[][] = new String[10][1];
    
    public static int timer = 30;
    public static int ans_given = 0;
    public static int count =0;
    public static int score =0;
    String username;
    Html(String username){
        this.username = username;
        setBounds(200,70,900,600);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image11.jpg"));
        Image img2 =img1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon img3=new ImageIcon(img2);
        JLabel img= new JLabel(img3);
        img.setBounds(0,0,900,600);
        add(img);
        
        
        qno = new JLabel();
        qno.setBounds(20,30,50,30);
        qno.setFont(new Font("Tohma", Font.BOLD,20));
        qno.setForeground(Color.black);
        img.add(qno);
        
        que1 = new JLabel();
        que1.setBounds(60,30,900,30);
        que1.setFont(new Font("Tohma", Font.BOLD,20));
        que1.setForeground(Color.black);
        img.add(que1);
        
        
        questions[0][0] = "What does HTML stand for??";
        questions[0][1] = "Hyper Transfer Markup Language";
        questions[0][2] = "Hyper Text Markup Language";
        questions[0][3] = "High-level Text Markup Language";
        questions[0][4] = "Hyperlink and Text Markup Language";

        questions[1][0] = "Which HTML tag is used to create a hyperlink?";
        questions[1][1] = "<link>";
        questions[1][2] = "<href>";
        questions[1][3] = "<a>";
        questions[1][4] = "<hyperlink>";

        questions[2][0] = " What is the purpose of the HTML <head> element?";
        questions[2][1] = " It defines the main content of the document.";
        questions[2][2] = "It contains metadata about the document.";
        questions[2][3] = " It specifies the structure of the document.";
        questions[2][4] = "It defines a header for the document.";

        questions[3][0] = "Which attribute is used to define inline styles in HTML?";
        questions[3][1] = "style";
        questions[3][2] = "css";
        questions[3][3] = "inline";
        questions[3][4] = "design";

        questions[4][0] = "How do you create an unordered list in HTML?";
        questions[4][1] = "<list>";
        questions[4][2] = "<ol>";
        questions[4][3] = "<ul>";
        questions[4][4] = "<li>";

        questions[5][0] = "How can you comment out multiple lines in HTML?";
        questions[5][1] = "<!-- This is a comment -->";
        questions[5][2] = "/* This is a comment */";
        questions[5][3] = "# This is a comment #";
        questions[5][4] = "// This is a comment";

        questions[6][0] = "What does the HTML <br> tag do?";
        questions[6][1] = " It creates a bold text.";
        questions[6][2] = " It inserts a line break.";
        questions[6][3] = " It defines a block of code.";
        questions[6][4] = " It makes text italic.";

        questions[7][0] = "Which HTML tag is used to define the structure of an HTML document, including the document's title and metadata?";
        questions[7][1] = "<header>";
        questions[7][2] = "<document>";
        questions[7][3] = "<head>";
        questions[7][4] = "<title>";

        questions[8][0] = "What does the HTML attribute src stand for?";
        questions[8][1] = "Source";
        questions[8][2] = "Script";
        questions[8][3] = "Style";
        questions[8][4] = "Subresource";

        questions[9][0] = "Which HTML tag is used for creating a table?";
        questions[9][1] = "<table>";
        questions[9][2] = "<grid>";
        questions[9][3] = "<tab>";
        questions[9][4] = "<tbl>";
        
        
        
        
        answers[0][1] = "Hyper Text Markup Language";
        answers[1][1] = "<a>";
        answers[2][1] = "It contains metadata about the document.";
        answers[3][1] = "style";
        answers[4][1] = "<ul>";
        answers[5][1] = "<!-- This is a comment -->";
        answers[6][1] = "It inserts a line break.";
        answers[7][1] = "<head>";
        answers[8][1] = "Source";
        answers[9][1] = "<table>";
        
        
        opt1 = new JRadioButton();
        opt1.setBounds(60,90,500,30);
        opt1.setBackground(new Color(135, 206, 235));
        opt1.setFont(new Font("Tohma", Font.BOLD,18));
        img.add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(60,130,500,30);
        opt2.setBackground(new Color(135, 206, 235));
        opt2.setFont(new Font("Tohma", Font.BOLD,18));
        img.add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(60,170,500,30);
        opt3.setBackground(new Color(135, 206, 235));
        opt3.setFont(new Font("Tohma", Font.BOLD,18));
        img.add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(60,210,500,30);
        opt4.setBackground(new Color(135, 206, 235));
        opt4.setFont(new Font("Tohma", Font.BOLD,18));
        img.add(opt4);
        
        buttongroup = new ButtonGroup();
        buttongroup.add(opt1);
        buttongroup.add(opt2);
        buttongroup.add(opt3);
        buttongroup.add(opt4); 
        
        
        next = new JButton("Next");
        next.setBounds(360,300,120,30);
        next.setBackground(new Color(10, 10, 130));
        next.setForeground(Color.white);
        next.setFont(new Font("Tohma", Font.BOLD,12));
        next.setBorder(new LineBorder(new Color(133,145,170)));
        next.setFocusPainted(false);
        next.addActionListener(this);
        img.add(next);
        
        lifeline = new JButton("Lifeline");
        lifeline.setBounds(360,360,120,30);
        lifeline.setBackground(new Color(10, 10, 130));
        lifeline.setForeground(Color.white);
        lifeline.setFont(new Font("Tohma", Font.BOLD,12));
        lifeline.setBorder(new LineBorder(new Color(133,145,170)));
        lifeline.setFocusPainted(false);
        lifeline.addActionListener(this);
        img.add(lifeline);
        
        
        submit = new JButton("Submit");
        submit.setBounds(700,500,120,30);
        submit.setBackground(new Color(10, 10, 130));
        submit.setForeground(Color.white);
        submit.setFont(new Font("Tohma", Font.BOLD,12));
        submit.setBorder(new LineBorder(new Color(133,145,170)));
        submit.setEnabled(false);
        submit.setFocusPainted(false);
        submit.addActionListener(this);
        img.add(submit);   
        
        
        start(count);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if(buttongroup.getSelection() == null){
                userans[count][0]= "";
            }else{
                userans[count][0]= buttongroup.getSelection().getActionCommand();
            }
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
            
        } else if(ae.getSource() == lifeline){
            
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
        }
            lifeline.setEnabled(false);
        }else if (ae.getSource() == submit){
            ans_given = 1;
            if(buttongroup.getSelection()== null){
                    userans[count][0]= " ";
                }else{
                    userans[count][0]=buttongroup.getSelection().getActionCommand();
                }
                for(int i=0 ; i < userans.length; i++){
                    if(userans[i][0].equals(answers[i][1])){
                        score += 10;
                    }
                }
                setVisible(false);
                new Score(username, score);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time left " + timer + " Seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tohma", Font.BOLD,18));
        
        if(timer > 0){
            g.drawString(time, 700, 60);
        }else{
            g.drawString("Times Up!!!", 700, 60);
        }
        timer --;
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 30;
        }else if(timer < 0){
            timer = 30;
            
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9){
                
                if(buttongroup.getSelection()== null){
                    userans[count][0]= " ";
                }else{
                    userans[count][0]=buttongroup.getSelection().getActionCommand();
                }
                for(int i=0 ; i < userans.length; i++){
                    if(userans[i][0].equals(answers[i][1])){
                        score += 10;
                    }
                }
                setVisible(false);
                
            }else{
                if(buttongroup.getSelection()== null){
                    userans[count][0]= " ";
                }else{
                    userans[count][0]=buttongroup.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
        
    }
    
    public void start(int count){
        qno.setText(" " + (count +1) + ". ");
        que1.setText(questions[count][0]);
        
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        buttongroup.clearSelection();
    }
    
    public static void main(String[] args) {
        new Html("user");
    }
}

