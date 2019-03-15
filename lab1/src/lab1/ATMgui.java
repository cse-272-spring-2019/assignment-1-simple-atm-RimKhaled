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

/**
 *
 * @author R
 */
public class ATMgui extends JFrame {

    JButton withdraw = new JButton("Withdraw");
    JButton deposit = new JButton("deposit");
    JButton balance = new JButton("balance");
    JButton prev = new JButton("prev");
    JButton next = new JButton("next");

    JLabel label = new JLabel("label");
    Account acct;

    public ATMgui(Account ac) {
        acct = ac;
        setLayout(null);

        withdraw.setBounds(70, 30, 150, 20);
        deposit.setBounds(70, 65, 150, 20);
        balance.setBounds(70, 100, 150, 20);
        prev.setBounds(70, 135, 150, 20);
        next.setBounds(70, 170, 150, 20);
        label.setBounds(70, 200, 150, 20);
        withdraw.setBackground(Color.LIGHT_GRAY);
        deposit.setBackground(Color.LIGHT_GRAY);
        balance.setBackground(Color.LIGHT_GRAY);
        prev.setBackground(Color.LIGHT_GRAY);
        next.setBackground(Color.LIGHT_GRAY);
        add(withdraw);
        add(deposit);
        add(balance);
        add(prev);
        add(next);
        add(label);
        // getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //actionlogin();
        withdraw.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                withdraw w = new withdraw(acct);
                w.setVisible(true);
                w.setSize(400, 600);
                // setVisible(false);
            }
        });
        balance.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(ac.getBalanc() + "");
            }
        });
        deposit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                deposit d = new deposit(acct);
                d.setVisible(true);
                d.setSize(400, 600);
            }
        });
        prev.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(ac.prev() + "");
            }
        });

        next.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(ac.next() + "");
            }
        });

    }
}
