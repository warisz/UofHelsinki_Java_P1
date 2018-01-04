/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waris
 */
public class BoundedCounter {
    private int value;
    private int upperBound;
    
    public BoundedCounter(int upperLimit){
        this.value = 0;
        this.upperBound = upperLimit;
    }
    
    public void next(){
        this.value++;
        if(this.value>this.upperBound){
            this.value = 0;
        }
    }

    @Override
    public String toString() {
        if(this.value<10){
            return "0" + this.value;
        }else{
            return "" + this.value;
        }
        
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int value){
        if (value>=0 && value<=this.upperBound){
            this.value = value;
        }
    }
    
}
