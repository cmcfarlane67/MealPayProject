public class Transaction {
    // Fields
    private int month;
    private int day;
    private double amount;

    // Constructors
    public Transaction(int myMonth, int myDay, double amount2){
        month = myMonth;
        day = myDay;
        amount = amount2;
    }

    // Methods
    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public double getAmount(){
        return amount;
    }

    public String toString(){
        return month + "/" + day + ": $" + amount;
    }
}
