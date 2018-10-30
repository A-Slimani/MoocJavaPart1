
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public MyDate afterNumberOfDays(int days){
        advance(days);
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);
        
        return newMyDate;
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
    
    public void advance(){
        day += 1;
    }
    
    public void advance(int numberOfDays){
        this.day += numberOfDays;
        System.out.println(this.day);
        int remaining = this.day - 30;
        
        if(this.day >= 31){
            this.day = remaining;
            if(this.month > 12){
                this.year += 1;
            } else {
                this.month += 1;
            }
        }
    }
    
  

}
