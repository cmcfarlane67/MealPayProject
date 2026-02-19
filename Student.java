import java.util.*;

public class Student {
    // Fields
    private String name;
    private int id;
    private double balance;
    private static int idGen = 1;
    private ArrayList<Transaction> transaction;

    // Constructor
    public Student(String myName){
        name = myName;
        balance = 0;
        id = idGen;
        idGen++;
        transaction = new ArrayList<Transaction>();
    }

    // Methods
    public void chargeLunch(int month, int day){
        balance -= 7; // Hard code for lunch amount
        Transaction t = new Transaction(month, day, -7);
        transaction.add(t);
    }

    public void addFunds(int month, int day, int amount){
        balance += amount;
        Transaction t = new Transaction(month, day, amount);
        transaction.add(t);
    }

    // Return null if there are no transactions on that day
    public ArrayList<Transaction> getTransactionByDate(int month, int day){
        ArrayList<Transaction> givenDay = new ArrayList<Transaction>();
        for(Transaction t : transaction){
            if(month == t.getMonth() && day == t.getDay()){
                givenDay.add(t);
            }
        }
        if(givenDay.size() == 0){
            return null;
        } else {
            return givenDay;
        }
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public String toString(){
        String transaction = "";
        for(Transaction t : transaction){
            transaction += t.toString();
        }
        return "Name: " + name + " ID: " + id + " Balance: " + balance + " Transactions: " + transaction + "\n";
    }
}
