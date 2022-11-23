import java.util.*;
public class Q1 {



    public static void loadArray(int[] list) {

        for (int i = 1; i < list.length; i++)
        {
            list[i] = list[i] + list[i - 1];
//            for (int j=0;j<list.length;j++){
//                System.out.println(list[j]);
//            }
            System.out.println(Arrays.toString(list));
        }
    }


    public static void main(String[] args) {
        int[] temp = {7};
        Q1.loadArray(temp);
        int[] temp1 = {3,6};
        Q1.loadArray(temp1);
        int[] temp2 = {4,6,8};
        Q1.loadArray(temp2);
        int[] temp3 = {1,2,3,4};
        Q1.loadArray(temp3);
        int[] temp4 = {8, 4, 2, 0, 4};
        Q1.loadArray(temp4);
    }
}
