package week_4;

public class Letter  implements Printable{
    String textFld="Hi Kusal";

    @Override
    public void print() {
        System.out.println(textFld);
    }

    public static void main(String[] args) {
        Printable L = new Letter();
        L.print();
        Printable S = new Student();
        S.print();
        }
    }

