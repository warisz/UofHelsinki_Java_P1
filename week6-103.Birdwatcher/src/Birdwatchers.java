/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waris
 */
import java.util.ArrayList;
public class Birdwatchers {
    private ArrayList<Bird> birdList;
    
    public Birdwatchers(){
        this.birdList = new ArrayList<Bird>();
    }
    
    public void add(String birdName, String latinName){
        birdList.add(new Bird(birdName, latinName));
    }
    
    public boolean birdCheck(String observation){
        boolean checker = false;
        for(Bird bird : birdList){
            if(bird.getName().equals(observation)){
                bird.addObservation();
                return true;
            }
        }
        return checker;
    }
    
    public void statistics(){
        for(Bird bird : birdList){
            System.out.println(bird);
        }
    
        
    }
    
    public void show(String name){
        for(Bird bird : birdList){
            if (bird.getName().equals(name)){
                System.out.println(bird);
            }
        }
    }
}
