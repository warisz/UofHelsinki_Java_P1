
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Birdwatchers birds = new Birdwatchers();
        
            String command = " ";
            while(true){
                System.out.print("? ");
                command = reader.nextLine();
                
                if(command.equals("Quit")){
                    break;
                    
                }else if(command.equals("Add")){
                    System.out.print("Name: ");
                    String name = reader.nextLine();
                    System.out.print("Latin Name: ");
                    String latinName = reader.nextLine();
                    
                    birds.add(name, latinName);
                    
                }else if(command.equals("Statistics")){
                    birds.statistics();
                    
                }else if(command.equals("Show")){
                    System.out.print("What? ");
                    String select = reader.nextLine();
                    birds.show(select);
                    
                }else if(command.equals("Observation")){
                    System.out.print("What was observed:? ");
                    String birdName = reader.nextLine();
                    boolean checker = birds.birdCheck(birdName);
                    if(!checker){
                        System.out.println("Is not a bird!");
                    }
                }
                
            }
    }

}
