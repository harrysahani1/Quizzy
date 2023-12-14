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
public class Sql extends JFrame implements ActionListener{
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
    Sql(String username){
        this.username = username;
        setBounds(200,70,900,600);
        
        ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("image/image13.jpg"));
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
        
        
                
        questions[0][0] = "How do you retrieve all columns from a table named employees in MySQL?";
        questions[0][1] = "SELECT * FROM employees;";
        questions[0][2] = "SELECT ALL FROM employees;";
        questions[0][3] = "RETRIEVE COLUMNS employees;";
        questions[0][4] = "GET * employees;";

        questions[1][0] = "What SQL statement is used to update data in a table?";
        questions[1][1] = "CHANGE";
        questions[1][2] = "UPDATE";
        questions[1][3] = "MODIFY";
        questions[1][4] = "ALTER";

        questions[2][0] = "How do you delete all records from a table named customers in MySQL?";
        questions[2][1] = "REMOVE * FROM customers;";
        questions[2][2] = "DELETE FROM customers;";
        questions[2][3] = "DROP customers;";
        questions[2][4] = "TRUNCATE customers;";

        questions[3][0] = "What is the purpose of the COUNT function in MySQL?";
        questions[3][1] = "Counts the total number of rows in a table";
        questions[3][2] = "Counts the distinct values in a column";
        questions[3][3] = "Counts the number of NULL values in a column";
        questions[3][4] = "Counts the unique values in a column";

        questions[4][0] = "Which SQL clause is used to filter the results of a query?";
        questions[4][1] = "GROUP BY";
        questions[4][2] = "FILTER";
        questions[4][3] = "WHERE";
        questions[4][4] = "SORT";

        questions[5][0] = "How do you add a new column named age with data type INT to a table named students?";
        questions[5][1] = "ADD COLUMN age INT TO students;";
        questions[5][2] = "ALTER TABLE students ADD COLUMN age INT;";
        questions[5][3] = "CREATE COLUMN age INT IN students;";
        questions[5][4] = "INSERT COLUMN age INT INTO students;";

        questions[6][0] = "What is the purpose of the JOIN clause in SQL?";
        questions[6][1] = "Combines rows from two or more tables based on a related column";
        questions[6][2] = "Sorts the result set in ascending order";
        questions[6][3] = "Filters the result set based on a condition";
        questions[6][4] = "Groups the result set by one or more columns";

        questions[7][0] = "Which MySQL statement is used to sort the result set in descending order?";
        questions[7][1] = "ORDER BY DESC";
        questions[7][2] = "SORT DESC";
        questions[7][3] = "DESCENDING";
        questions[7][4] = "ORDER BY column_name DESC";

        questions[8][0] = "What is the purpose of the GROUP BY clause in SQL?";
        questions[8][1] = "Groups the result set by one or more columns";
        questions[8][2] = "Filters the result set based on a condition";
        questions[8][3] = "Joins multiple tables together";
        questions[8][4] = "Orders the result set in ascending order";

        questions[9][0] = "How do you retrieve unique values from a column named city in a table named addresses?";
        questions[9][1] = "SELECT DISTINCT city FROM addresses;";
        questions[9][2] = "UNIQUE city FROM addresses;";
        questions[9][3] = "DISTINCT addresses.city;";
        questions[9][4] = "FILTER UNIQUE city FROM addresses;";
        
        

	answers[0][1] = "SELECT * FROM employees;";
        answers[1][1] = "UPDATE";
        answers[2][1] = "DELETE FROM customers;";
        answers[3][1] = "Counts the total number of rows in a table";
        answers[4][1] = "WHERE";
        answers[5][1] = "ALTER TABLE students ADD COLUMN age INT;";
        answers[6][1] = "Combines rows from two or more tables based on a related column";
        answers[7][1] = "ORDER BY column_name DESC";
        answers[8][1] = "Groups the result set by one or more columns";
        answers[9][1] = "SELECT DISTINCT city FROM addresses;";
        
        
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
        new Sql("user");
    }
}

