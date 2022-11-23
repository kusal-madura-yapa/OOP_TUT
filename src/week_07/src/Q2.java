import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q2 {

    public static void listDemo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
        {
            int element = list.get(i);
            list.remove(i);
            list.add(0, element + 1);
        }

        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        arr.add(15);
        arr.add(10);
        arr.add(5);
        Q2.listDemo(arr);
        ArrayList <Integer> arr1 = new ArrayList<Integer>();
        arr1.add(4);
        arr1.add(7);
        arr1.add(8);
        arr1.add(7);
        arr1.add(4);
        Q2.listDemo(arr1);
        ArrayList <Integer> arr2 = new ArrayList<Integer>();
        Collections.addAll(arr2,-1,3,28,17,9,30);
        Q2.listDemo(arr2);


    }
}
