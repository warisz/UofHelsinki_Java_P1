public class Reformatory {
    
    private int weightMeasuredAmount;
    
    public Reformatory(){
        this.weightMeasuredAmount = 0;
    }

    public int weight(Person person) {
        this.weightMeasuredAmount++;
        return person.getWeight();
    }
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured(){
        return this.weightMeasuredAmount;
    }
}
