/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author R
 */
public interface ATM {
    public  String getCurrentBalanc();
    public void withdraw(String amount);
    public void deposit(String amount);
    public String prev();
    public String next();
}
