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
import javax.swing.JTextField;

public class deposit extends JFrame {

   
    JButton deposit = new JButton("Deposit");
    JLabel lbl = new JLabel("enter amount");
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
    Account ac;

    public deposit(Account a) {
        ac = a;
        setLayout(null);
        lbl.setBounds(70, 30, 150, 20);
        txt.setBounds(70, 65, 150, 20);
        deposit.setBounds(110, 100, 80, 20);
        zero.setBounds(70, 200, 50, 50);
        one.setBounds(130, 200, 50, 50);
        two.setBounds(190, 200, 50, 50);
        three.setBounds(70, 250, 50, 50);
        four.setBounds(130, 250, 50, 50);
        five.setBounds(190, 250, 50, 50);
        six.setBounds(70, 300, 50, 50);
        seven.setBounds(130, 300, 50, 50);
        eight.setBounds(190, 300, 50, 50);
        nine.setBounds(130, 350, 50, 50);
        deposit.setBackground(Color.YELLOW);
        add(deposit);
        add(lbl);
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
        
        
       deposit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
               ac.deposit(txt.getText());
               setVisible(false);
            }
        });
         

    }
}
