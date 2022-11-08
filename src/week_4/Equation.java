package week_4;

interface Equation {
    public static final  int numberOfVariables = 1;

    public abstract double solve();
//    interface can contain abstract methods and public accuses
//    private double solve(); can't happen
//    public void printFormula() {
//        System.out.println("x^2 + 3x + 1");
//    cannot contain any no abstract method it is different from the abstract class of this
//    }
}

