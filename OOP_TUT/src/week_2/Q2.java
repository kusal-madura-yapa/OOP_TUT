package week_2;

public class Q2 {

//This method appends one String to the end of another.
// The method returns a String with the value of the String passed into the method,
// appended to the end of the String, used to invoke this method.

    // and the output contain with no any spaces then that is seen like one string
    // if that we use in siring concat  that see like without spaces it show that
    // strings is become a one string by concat


    public static void main(String[] args) {
        // string set
        String s = "My";
        String l = "Dog";
        System.out.println(s + l);
        System.out.println("My" + "Dog");


        String q = "Strings are immutable";
        l = q.concat(" all the time");
        System.out.println(l);

// *******************************************************************


        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

         animal2=animal1.concat(" lazy dog");
         article=animal2.concat(" the");
         action =article.concat(" jumps over");

        System.out.println(action);

        String a1 = "quick brown fox";
        String a2 = " lazy dog";
        String art = " the";
        String act = " jumps over";

        System.out.println(a1+a2+art+act);
    }
}

