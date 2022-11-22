package week_4;

import java.util.ArrayList;
import java.util.Collections;

public class BankAccountSort {
    public static final BankAcount BAL_1 = new BankAcount(1700);

    public static void main(String[] args) {
        BankAcount bal1 = new BankAcount(1700);
        BankAcount bal2 = new BankAcount(7900);
        BankAcount bal3 = new BankAcount(3300);

        ArrayList<BankAcount> list = new ArrayList<BankAcount>();
        list.add(BAL_1);
        list.add(bal2);
        list.add(bal3);

        System.out.println(BAL_1.compareTo(bal2));

        Collections.sort(list);

        for (BankAcount b : list)
            System.out.println(b.getBalance());
    }
}