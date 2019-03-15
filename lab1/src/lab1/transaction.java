/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 */
public class transaction {

    private String type;
    private double amount;

    public transaction(String gender, double amount) {
        this.type = gender;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setGender(String gender) {
        this.type = gender;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
