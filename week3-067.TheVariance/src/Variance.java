import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for(int x : list){
            sum+=x;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = (double)sum(list)/list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double sumOfDifs = 0;
        double average = average(list);
        for(int x : list){
            sumOfDifs+=Math.pow(x-average, 2);
        }
        double variance = (double)sumOfDifs/(list.size()-1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);

                
        System.out.println("The variance is: " + variance(list));
    }

}
