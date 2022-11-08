package week_4;

import java.util.ArrayList;
import java.util.Collections;


public class BankAccount2Tester {
    public static void main(String[] args) {
        BankAccount2 bankAccount1 = new BankAccount2(4000);
        BankAccount2 bankAccount2 = new BankAccount2(2000);
        BankAccount2 bankAccount3 = new BankAccount2(6000);

        ArrayList<BankAccount2> list2 = new ArrayList<BankAccount2>();
        list2.add(bankAccount1);
        list2.add(bankAccount2);
        list2.add(bankAccount3);

        list2.sort(bankAccount1);

        for (BankAccount2 b : list2)
            System.out.println(b.getBalance2());
    }
}
