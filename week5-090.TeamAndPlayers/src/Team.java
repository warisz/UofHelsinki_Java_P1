
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author waris
 */
public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> teamList;
    
    public Team (String name){
        this.name = name;
        this.teamList = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        if (size() < this.maxSize){
            this.teamList.add(player);
        }
    }
    
    public void printPlayers(){
        for (Player player : teamList){
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return teamList.size();
    }
    
    public int goals(){
        int goals = 0;
        for(Player player : teamList){
            goals += player.goals();
        }
        return goals;
    }
}
