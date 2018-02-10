
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waris
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
        
    }
    
    public NightSky(int width, int height){
        this.width = width;
        this.height = height;
        this.density = 0.1;
        
        
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
        
    }
    
    public void printLine(){
        Random rand = new Random();
        this.starsInLastPrint = 0;
        
        for(int i=0; i<this.width; i++){
            double probability = rand.nextDouble();
            if(probability<=this.density){
                System.out.print("*");
                this.starsInLastPrint++;
            }else{
                System.out.print(" ");
            }
        }
    }
    
    public void print(){
        Random rand = new Random();
        this.starsInLastPrint = 0;
        
        for (int i=0; i<this.height; i++){
            for(int j=0; j<this.width; j++){
                double probability = rand.nextDouble();
                if(probability<=this.density){
                    System.out.print("*");
                    this.starsInLastPrint++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
