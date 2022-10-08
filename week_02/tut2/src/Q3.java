import java.awt.Rectangle;
public class Q3 {

    public static void main(String[] args) {


        Rectangle r1 = new Rectangle(0, 0, 100, 50);
        Rectangle r2 = new Rectangle(0, 0, 100, 50);

//                System.out.println(r1);
//                r2.grow(10,20);
//                System.out.println(r2);

            System.out.println(r1);
            growRectangle(r2);
            System.out.println(r2);

    }
    public static void growRectangle(Rectangle r){
        r.grow(10, 20);

    }




}


