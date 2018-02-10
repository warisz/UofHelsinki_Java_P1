
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        return new Money (this.euros() + added.euros(), this.cents() + added.cents());
    }
    
    public boolean less (Money compared){
        if (compared.euros() > this.euros() || compared.euros() == this.euros() && compared.cents() > this.cents()){
            return true;
        }else{
            return false;
        }
    }
    
    public Money minus(Money decremented){
        int thisCents = this.euros() * 100 + this.cents();
        int decrementedCents = decremented.euros() * 100 + decremented.cents();
        int difference = thisCents - decrementedCents;
        if(difference < 0){
            return new Money (0,0);
        }
        return new Money (0, difference);
    }
    
}
