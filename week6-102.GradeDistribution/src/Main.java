import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
        ArrayList<Integer> scoreList = new ArrayList<Integer>();
        int passed = 0;
        int allScores = 0; 
        
        System.out.println("Type exam scores, -1 completes:");
        
        for(int num=0; num!=-1; num = Integer.parseInt(reader.nextLine())){
            scoreList.add(num);
        }
        System.out.println(scoreList);
        int[] scoreFinderList = new int[6];
        
        for(int i : scoreList){
            if(i!=0 && i<61){
                if (i>=50 ){
                    scoreFinderList[5] += 1;  
                }else if (i>=45){
                    scoreFinderList[4] += 1;
                }else if (i>=40){
                    scoreFinderList[3] += 1;
                }else if (i>=35){
                    scoreFinderList[2] += 1;
                }else if (i>=30){
                    scoreFinderList[1] += 1;
                }else if (i<=29 && i>0){
                    scoreFinderList[0] += 1;
                } 
            }
            
            if(i>29){
                passed++;
            }
            if(i!=0){
                allScores++;
            }
    }
        starPrinter(scoreFinderList);
        System.out.print("Acceptance percentage: " + acceptanceAvg(passed, allScores));
     
}
    
    public static void starPrinter(int[] list){
        System.out.println("Grade distribution:");
        for(int i = list.length-1; i>=0; i--){
            System.out.print(i + ": ");
            for(int j=0; j<list[i]; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
        public static double acceptanceAvg(double passed, double all){
        return 100*passed/all; 
       
    }
}

