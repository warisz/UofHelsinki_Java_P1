 

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int[] copy (int[] array){
        int[] copied = new int[array.length];
        for(int i=0; i<array.length; i++){
            copied[i] = array[i];
        }
        return copied;
    }
    
    public static int[] reverseCopy (int[] array){
        int[] copied = new int[array.length];
        int copiedIndex = 0;
        for(int i=array.length-1; i>=0; i--){
            copied[copiedIndex] = array[i];
            copiedIndex++;
        }
        return copied;
    }
}
