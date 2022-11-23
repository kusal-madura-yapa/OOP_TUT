package Q4;
import java.util.ArrayList;


    class Book {
        public String author;
        public String title;
        public int h;
    }
    public class ConTst {
        public static void main(String[] args) {
            ArrayList list = new ArrayList();
            list.add(3.4);
            list.add(new Integer(4));
            Book myBook = new Book();
            list.add(myBook);
            double d;
            d = (Double) list.get(0);
            Integer d2 = (Integer) list.get(1);

            Integer b3 = (Integer) list.get(1);
            Book b2 = (Book) list.get(2);
        }

    }

