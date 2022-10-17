import java.util.Random;

public class Q6 {
//6 A Lottery Program
//A lottery ticket consists of 6 unique numbers in the range between 1 and 49.
//Can you write a Java program which calculates such a 6 lucky random unique numbers which
//your program user can play in the next lottery?

    public static void main(String[] args) {

        System.out.print("Random Integers are :");
        getRandom();
        getRandom();
        getRandom();
        getRandom();
        getRandom();
        getRandom();


    }

    static void getRandom(){
        // create instance of Random class
        Random rand = new Random();
        int rand_int = rand.nextInt(49);

        if (rand_int==0) {
            getRandom();
        }
        else {
            System.out.print(rand_int + " ");
        }
    }

}
