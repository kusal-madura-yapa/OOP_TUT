import java.util.Random;

public class Q5 {


    public static void main(String[] args) {
        boolean [] dayInTheYear = new boolean[];
        int numOfPeople = 0;

        Random random = new Random();
        while(true ){
            ++numOfPeople;
            int birthaday= random.nextInt(365);

            if (dayInTheYear[birthaday]){
                break;

            }else{
                dayInTheYear[birthaday]=true;
            }
        }
        System.out.println("Num" + numOfPeople);
    }
}
