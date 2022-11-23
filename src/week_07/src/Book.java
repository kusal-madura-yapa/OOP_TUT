import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private static String title = "kl";
    private static Double price ;
    private static int  publiashed ;
    private static String  author;

 public  Book(String t,Double pr,int pu,String au){
     this.title= t;
     this.price=pr;
     this.publiashed=pu;
     this.author=au;
 }

    public  static void getTitle(String title){
     this.title=title;
    }
    public static void getPrice(Double price){
        this.price=price;
    }
    public void getPubliashed(int publiashed){
        this.publiashed=publiashed;
    }
    public void getAuthor(String author){
     this.author=author;
    }
    public String Title(String title){
       return title;
    }
    public Double Price(Double price){
        return price;
    }
    public int  Publiashed(int publiashed){
       return publiashed;
    }
    public String Author(String author){
        return author;
    }

    public static void main(String[] args) {
        ArrayList <Book> arr= new ArrayList<>();
        Scanner n = new Scanner(System.in);
        System.out.println("Title");
        Book.getTitle(n.next()) ;
        System.out.println("Price");
        Double pr = n.nextDouble();
        System.out.println("Publish");
        int pu = n.nextInt();
        System.out.println("Author");
        String au = n.next();

        Book book1 =new Book(m,pr,pu,au);
        book1.toString();
        // print and to toSring



    }


}
