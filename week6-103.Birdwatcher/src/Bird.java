/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waris
 */
public class Bird {
    private String name;
    private String latinName;
    private int obsNum;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.obsNum=0;
    }
    
    public void addObservation(){
        this.obsNum++;
    }
    
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.latinName + ")" + ": " + this.obsNum + " observations";
    }
    
    
}
