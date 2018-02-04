
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate compared){
        
        boolean earlier = this.earlier(compared);
        int dif = 0;
        
        if(earlier){
            if(this.month < compared.month || (this.month == compared.month && this.day<=compared.day)){
                dif = compared.year - this.year;
            }else{
                dif = compared.year - this.year - 1;
            }
        }else{
            if(compared.month < this.month || (compared.month == this.month && compared.day <= this.day)){
                dif =  this.year - compared.year;
            }else{
                dif = this.year - compared.year - 1;
        }
        }
        
        if (dif < 0){
            return 0;
        }else{
            return dif;
        }

    }


  
}
