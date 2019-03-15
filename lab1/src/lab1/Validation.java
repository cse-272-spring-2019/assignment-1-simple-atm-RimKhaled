/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author R
 */
public class Validation extends JFrame {
    
    JButton blogin = new JButton("Validate");
    JLabel txuser = new JLabel("Card Nos");
    JTextField txt = new JTextField(50);
    JButton zero = new JButton("0");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    
    Account a=new Account(0,"321");
    
    public Validation() {
        setLayout(null);
        
        txuser.setBounds(70, 30, 150, 20);
        txt.setBounds(70, 65, 150, 20);
        blogin.setBounds(110, 100, 80, 20);
        zero.setBounds(70, 200, 50, 50);
        one.setBounds(130, 200, 50, 50);
        two.setBounds(190, 200, 50, 50);
        three.setBounds(70, 250, 50, 50);
        four.setBounds(130, 250, 50, 50);
        five.setBounds(190, 250, 50, 50);
        six.setBounds(70, 300, 50, 50);
        seven.setBounds(130, 300, 50, 50);
        eight.setBounds(190,300, 50, 50);
        nine.setBounds(130, 350, 50, 50);
        blogin.setBackground(Color.YELLOW);
        add(blogin);
        add(txuser);
        add(txt);
        add(zero);
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        
        
        // getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //actionlogin();

        zero.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "0");
            }
        });
        one.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "1");
            }
        });
        two.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "2");
            }
        });
        three.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "3");
            }
        });
        four.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               txt.setText(txt.getText()+"4");
            }
        });
        five.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText() + "5");
            }
        });
        six.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+"6");
            }
        });
        seven.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText(txt.getText()+"7");
            }
        });
        eight.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            txt.setText(txt.getText()+"8");
            }
        });
        nine.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             txt.setText(txt.getText()+"9");
            }
        });
        blogin.addActionListener(new ActionListener() { 
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt.getText().equals(a.getCardNo())) {
                    ATMgui v = new ATMgui(a);
                    v.setVisible(true);
                    v.setSize(400, 600);
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "error");
                }
            }
        });
    }
    
}
