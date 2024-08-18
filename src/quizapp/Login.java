package quizapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules, back;
    JTextField tfname;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("quizapp/icons/quiz-time.jpg"));
        JLabel image = new JLabel(il);
        image.setBounds(-50, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(700, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(760, 150, 300, 45);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(685,200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.PLAIN,18));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(685, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(865, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource()==back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
