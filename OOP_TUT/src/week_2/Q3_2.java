package week_2;

import java.awt.*;

public class Q3_2 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        Rectangle r2 = r1;


        growRectangle(r2);
        System.out.println(r2);

    }
    public static void growRectangle(Rectangle r){
        r.grow(10, 20);

        }
}
