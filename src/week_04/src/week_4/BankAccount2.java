package week_4;

import java.util.Comparator;

public class BankAccount2 implements Comparator {
    private double balance2;

    public BankAccount2(double balance){
        this.balance2 = balance;
    }

    public double getBalance2() {
        return balance2;
    }

    @Override
    public int compare(Object account, Object otherAccount) {
        BankAccount2 acc1 = (BankAccount2) account;
        BankAccount2 otherAcc = (BankAccount2) otherAccount;
        if (acc1.balance2 > otherAcc.balance2){
            return 1;
        }
        else if(acc1.balance2 < otherAcc.balance2){
            return -1;
        }
        else {
            return 0;
        }
    }
}