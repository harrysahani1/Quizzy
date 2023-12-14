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
public class Cplus extends JFrame implements ActionListener{
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
    Cplus(String username){
        this.username = username;
        setBounds(200,70,900,600);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image10.jpg"));
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
        
        
                
        questions[0][0] = "What is the purpose of the cout object in C++?";
        questions[0][1] = "It is used for console input.";
        questions[0][2] = "It is used for console output.";
        questions[0][3] = "It represents a file stream.";
        questions[0][4] = "It is a reserved keyword and has no specific purpose.";

        questions[1][0] = "In C++, what is the difference between a class and an object?";
        questions[1][1] = "A class is a blueprint, and an object is an instance of a class.";
        questions[1][2] = "A class and an object are the same thing.";
        questions[1][3] = "A class is used for functions, and an object is used for variables.";
        questions[1][4] = "A class is a data type, and an object is a function.";

        questions[2][0] = "How do you define a constructor in a C++ class?";
        questions[2][1] = "construct()";
        questions[2][2] = "void constructor()";
        questions[2][3] = "~classname()";
        questions[2][4] = "classname()";

        questions[3][0] = "What is the purpose of the new operator in C++?";
        questions[3][1] = "It allocates memory for a variable.";
        questions[3][2] = "It creates a new instance of a class.";
        questions[3][3] = "It initializes a variable.";
        questions[3][4] = "It is used for mathematical operations.";

        questions[4][0] = "How do you inherit a class in C++?";
        questions[4][1] = "class ChildClass = ParentClass";
        questions[4][2] = "class ChildClass : ParentClass";
        questions[4][3] = "ChildClass.inherit(ParentClass)";
        questions[4][4] = "ChildClass -> ParentClass";

        questions[5][0] = "What is the purpose of the virtual keyword in C++?";
        questions[5][1] = "It indicates a variable is of a virtual type.";
        questions[5][2] = "It is used for console input.";
        questions[5][3] = "It specifies that a function can be overridden in a derived class.";
        questions[5][4] = "It is used for file handling.";

        questions[6][0] = "How do you access the elements of an array in C++?";
        questions[6][1] = "By using the at() method.";
        questions[6][2] = "By using the element() function.";
        questions[6][3] = "By using the index in square brackets.";
        questions[6][4] = "By using the access() keyword.";

        questions[7][0] = "What does the static keyword mean in C++?";
        questions[7][1] = "It indicates that a variable can only be accessed within the same file.";
        questions[7][2] = "It specifies that a function or variable belongs to the class rather than an instance of the class.";
        questions[7][3] = "It is used for dynamic memory allocation.";
        questions[7][4] = "It declares a constant.";

        questions[8][0] = "How do you declare a reference variable in C++?";
        questions[8][1] = "ref int x;";
        questions[8][2] = "int &x;";
        questions[8][3] = "reference x = int;";
        questions[8][4] = "int -> ref x;";

        questions[9][0] = "What is the purpose of the try, catch, and throw keywords in C++?";
        questions[9][1] = "They are used for file I/O operations.";
        questions[9][2] = "They define a loop structure.";
        questions[9][3] = "They are used for exception handling.";
        questions[9][4] = "They are used for defining classes.";
        
        

	answers[0][1] = "It is used for console output.";
        answers[1][1] = "A class is a blueprint, and an object is an instance of a class.";
        answers[2][1] = "classname()";
        answers[3][1] = "It allocates memory for a variable.";
        answers[4][1] = "class ChildClass : ParentClass";
        answers[5][1] = "It specifies that a function can be overridden in a derived class.";
        answers[6][1] = "By using the index in square brackets.";
        answers[7][1] = "It specifies that a function or variable belongs to the class rather than an instance of the class.";
        answers[8][1] = "int &x;";
        answers[9][1] = "They are used for exception handling.";
        
        
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
        new Cplus("user");
    }
}

