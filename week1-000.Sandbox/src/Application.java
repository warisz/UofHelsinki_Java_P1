 //sanbox for smallest num in a list - method
import java.util.*;

public class Application {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(1);
        
        System.out.println("Smallest number is " + smallestNum(list));
    }
    
    public static int smallestNum(ArrayList<Integer> list){
        int smallestNum = list.get(0);
        
        for(int x : list){
            if(x<smallestNum){
                smallestNum=x;
            }
        }
        return smallestNum;
        
    }
}
