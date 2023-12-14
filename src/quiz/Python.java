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
public class Python extends JFrame implements ActionListener{
    JLabel qno, que1;
    JRadioButton opt1,opt2,opt3,opt4;
    JButton next,lifeline,submit;
    ButtonGroup buttongroup;
    String questions [][] = new String[10][5];
    String answers[][] = new String[10][2];
    String userans[][] = new String[10][1];
    
    public static int timer = 20;
    public static int ans_given = 0;
    public static int count =0;
    public static int score =0;
    String username;
    Python(String username){
        this.username = username;
        setBounds(200,70,900,600);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image14.jpg"));
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
        
        
        questions[0][0] = "What is the purpose of the __init__ method in Python classes";
        questions[0][1] = "It initializes the class object.";
        questions[0][2] = "It is used for garbage collection.";
        questions[0][3] = "It defines the class methods.";
        questions[0][4] = "It is a reserved keyword and has no specific purpose.";

        questions[1][0] = "How do you open a file named \"example.txt\" in read-only mode in Python?";
        questions[1][1] = "file = open(\"example.txt\", \"r\")";
        questions[1][2] = "file = open(\"example.txt\", \"w\")";
        questions[1][3] = "file = open(\"example.txt\", \"rb\")";
        questions[1][4] = "file = open(\"example.txt\", \"ro\")";

        questions[2][0] = "What is the result of the expression 2**3 in Python?";
        questions[2][1] = "5";
        questions[2][2] = "6";
        questions[2][3] = "8";
        questions[2][4] = "9";

        questions[3][0] = "Which of the following statements is used to break out of a loop in Python?";
        questions[3][1] = "break";
        questions[3][2] = "stop";
        questions[3][3] = "exit";
        questions[3][4] = "end";

        questions[4][0] = "What is the purpose of the elif keyword in Python?";
        questions[4][1] = "It represents the end of a loop";
        questions[4][2] = "It is short for else if and is used for multiple conditional checks.";
        questions[4][3] = "It defines a function.";
        questions[4][4] = "It is a typo and has no meaning.";

        questions[5][0] = "What does the len() function do in Python?";
        questions[5][1] = "Returns the length of a list, tuple, or string.";
        questions[5][2] = "Returns the largest element in a list.";
        questions[5][3] = "Converts a string to lowercase.";
        questions[5][4] = "Rounds a floating-point number to the nearest integer.";

        questions[6][0] = "Which of the following is used for handling exceptions in Python?";
        questions[6][1] = "try and except";
        questions[6][2] = "if and else";
        questions[6][3] = "switch and case";
        questions[6][4] = "for and while";

        questions[7][0] = "What is the purpose of the pass statement in Python?";
        questions[7][1] = "It terminates the program.";
        questions[7][2] = "t is a comment.";
        questions[7][3] = "It is used to create a placeholder and does nothing.";
        questions[7][4] = "It skips the current iteration of a loop.";

        questions[8][0] = "How do you check if a key exists in a Python dictionary?";
        questions[8][1] = "key in dictionary";
        questions[8][2] = "dictionary.contains(key)";
        questions[8][3] = "dictionary.has_key(key)";
        questions[8][4] = "key.exists(dictionary)";

        questions[9][0] = "How do you remove an item from a list in Python?";
        questions[9][1] = "list.remove(item)";
        questions[9][2] = "list.discard(item)";
        questions[9][3] = "list.pop(index)";
        questions[9][4] = "del list[index]";
        
        
        
        
        answers[0][1] = "It initializes the class object.";
        answers[1][1] = "file = open(\"example.txt\", \"r\")";
        answers[2][1] = "8";
        answers[3][1] = "break";
        answers[4][1] = "It is short for else if and is used for multiple conditional checks.";
        answers[5][1] = "Returns the largest element in a list.";
        answers[6][1] = "try and except";
        answers[7][1] = "It is used to create a placeholder and does nothing.";
        answers[8][1] = "key.exists(dictionary)";
        answers[9][1] = "del list[index]";
        
        
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
            timer = 20;
        }else if(timer < 0){
            timer = 20;
            
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
        new Python("user");
    }
}

