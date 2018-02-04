
public class BoundedCounter {
    private int value;
    private int upperBound;
    
    public BoundedCounter(int upperLimit){
        this.value = 0;
        this.upperBound = upperLimit;
    }
    
    public void next(){
        this.value++;
        if(this.value>this.upperBound){
            this.value = 0;
        }
    }

    @Override
    public String toString() {
        if(this.value<10){
            return "0" + this.value;
        }else{
            return "" + this.value;
        }
        
    }
    
    public int getValue(){
        return this.value;
    }
    
    public void setValue(int value){
        if (value>=0 && value<=this.upperBound){
            this.value = value;
        }
    }
    
}

