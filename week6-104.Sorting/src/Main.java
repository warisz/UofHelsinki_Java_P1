
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int x : array){
            if(x<smallest){
                smallest=x;
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]<array[index]){
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
            int smallest = array[index];
            int smallestIndex = index;
            for(int i=index; i<array.length; i++){
                if(array[i] < smallest){
                    smallest = array[i];
                    smallestIndex = i;
                }
            }
            return smallestIndex;          
    }
    
    public static void swap(int[] array, int index1, int index2){
        int index1Saved = array[index1];
        array[index1] = array[index2];
        array[index2] = index1Saved;
    }
    
    public static void sort(int[] array){
        System.out.print("[");
        for(int j : array){
                System.out.print(j);
                if(j!=array[array.length-1]){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println("");
            
        for(int i=0; i<array.length; i++){
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.print("[");
            for(int j : array){
                System.out.print(j);
                if(j!=array[array.length-1]){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println("");
        }
        
    }
}
