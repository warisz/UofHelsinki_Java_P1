/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waris
 */
public class Counter {
    private int num;
    private boolean check;
    
    public Counter(int startingValue, boolean check){
        this.num = startingValue;
        this.check = check;         
    }
    
    public Counter(int startingValue){
        this(startingValue, false);
    }
    
    public Counter(boolean check){
        this(0, check);
    }
    
    public Counter(){
        this(0,false);
    }
    
    public int value(){
        return this.num;
    }
    
    public void increase(){
        this.increase(1);
    }
    
    public void increase(int increaseAmount){
        if (increaseAmount>0){
            this.num += increaseAmount;
        }
    }
    
    public void decrease(){
        this.decrease(1);
    }
    
    public void decrease(int decreaseAmount){
        if(decreaseAmount>0){
            this.num -= decreaseAmount;
            if(this.check && this.num<0){
                this.num=0;
            }
                    
        }
    }   
}
