/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waris
 */
public class Player {
    private String name;
    private int goals;
    
    public Player (String name, int goals){
        this.name = name;
        this.goals = goals;
        
    }
    public Player (String name){
        this(name, 0);
    }
    
    public String getName(){
        return this.name;
    }
    
    public int goals(){
        return this.goals;
    }

    @Override
    public String toString() {
       return this.name + " goals: " + this.goals;
    }
    
    
    
    
}
