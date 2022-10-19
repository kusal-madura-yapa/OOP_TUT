package week_2;

public class VendingMachine {


    private int canCount = 0;
    private int tokenCount = 0;
    public  void  fillUp(int cans)
    {
        canCount=cans;
        tokenCount=0;

    }
    public  void  insertToken()
    {

        //check the value of tokens.
        if (canCount==0 ){
            System.out.print("Token count = ");
            System.out.print(getTokenCount());
            System.out.println(" No any cans to get ");

        }else   {
            System.out.println("You can get a can, Here it is .......");
            canCount--;
            tokenCount++;

        }
    }

    public int getTokenCount() {

        return canCount;

    }

    public int getCanCount() {

        return tokenCount;

    }
}
