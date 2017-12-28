public class Spruce {

    public static void main(String[] args) {

        // Write code here
        int starAdder = 1;
        int whiteSpace = 4;
        for(int i=0;i<5;i++){
            for (int y=0; y<whiteSpace; y++){
                System.out.print(" ");
            }
            for(int x=0; x<starAdder; x++){
                System.out.print("*");
            }
            System.out.println("");
           starAdder+=2;
           whiteSpace--;
        }
        System.out.println("    *");
        
    }

}
