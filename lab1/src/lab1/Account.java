/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;

/**
 *
 * @author R
 */
public class Account implements ATM {

    private double balance;
    private String CardNo;
    ArrayList<transaction> history = new ArrayList();
    int historyIndex;

    public Account(double balance, String CardNo) {
        this.balance = balance;
        this.CardNo = CardNo;
    }

    public double getBalanc() {
        return balance;
    }

    public void setBalanc(double balanc) {
        this.balance = balanc;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    @Override
    public String getCurrentBalanc() {
        return balance + "";
    }

    @Override
    public void withdraw(String amount) {
        double am = Double.parseDouble(amount);
        balance = balance - am;
        transaction t = new transaction("withdraw", am);
        history.add(t);
        historyIndex = history.size() - 1;
    }

    @Override
    public void deposit(String amount) {
        double am = Double.parseDouble(amount);
        balance = balance + am;
        transaction t = new transaction("deposit", am);
        history.add(t);
        historyIndex = history.size() - 1;

    }

    @Override
    public String prev() {
        if (historyIndex < 0) {
            return "no transactions";
        } else {
            transaction t = history.get(historyIndex);
            historyIndex--;
            return t.getType() + " " + t.getAmount();
        }
    }

    @Override
    public String next() {

        historyIndex++;
        if (historyIndex > history.size() - 1) {
            return "no transactions";
        } else {
            transaction t = history.get(historyIndex);

            return t.getType() + " " + t.getAmount();

        }
    }}