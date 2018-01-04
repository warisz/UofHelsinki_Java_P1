/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waris
 */
public class Product {
    private double price;
    private int amount;
    private String name;
        
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.name = nameAtStart;
        this.amount = amountAtStart;
        this.price = priceAtStart;
    }
    
    public void printProduct(){
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
}
