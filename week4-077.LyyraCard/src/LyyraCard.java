/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waris
 */
public class LyyraCard {
    private double balance;
    
    public LyyraCard(double balance){
        this.balance = balance;
    }
    
    public String toString(){
        return "The card has " + balance + " euros";
    }
    
    public void payEconomical(){
        if(this.balance>=2.5){
            this.balance-=2.5;
        }
    }
    
    public void payGourmet(){
        if (this.balance>=4){
            this.balance-=4;
        }
    }
    
    public void loadMoney(double amount){
        if(amount>0){
            this.balance+=amount;
        }
        if(this.balance>150){
            this.balance=150;
        }
    }
}
