package week_4;

public class BankAcount implements Comparable<BankAcount>{
    private double balance;

    public BankAcount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int compareTo(BankAcount other) {
        if (balance > other.balance){
            return 1;
        }
        else if(balance < other.balance){
            return -1;
        }
        else {
            return 0;
        }
    }
}