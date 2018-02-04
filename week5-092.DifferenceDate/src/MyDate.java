public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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
    
    public int differenceInYears(MyDate compared){
        
        boolean earlier = this.earlier(compared);
        int dif = 0;
        
        if(earlier){
            if(compared.day >= this.day && compared.month >= this.month){
                dif = compared.year - this.year;
            }else{
                dif = compared.year - this.year - 1;
            }
        }else{
            if(compared.day <= this.day && compared.month <= this.month){
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
