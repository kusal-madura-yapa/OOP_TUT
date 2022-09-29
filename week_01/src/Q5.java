public class Q5 {
    //    5 Java Reminder - While Loops and ifs
    //Write the equivalent program using a while loop!
    //Your Java program displays all the even numbers (numbers which are divided exactly by 2)
    //in the range between 0 and 100.


    public static void main(String[] args) {
        int i=0;
        while(i<101){

            if (i%2==0){
                System.out.println(i);
            }

            i++;
        }
    }

}
