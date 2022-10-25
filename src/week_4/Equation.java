package week_4;

public interface Equation {
        int numberOfVariables = 1;
        private double solve();
        public void printFormula() {
            System.out.println("x^2 + 3x + 1");
        }
    }
    class LinearEquation implements Equation {
        public double solve() {
            numberOfVariables = 2;
// ... details omitted
        }
        public static void main(String[] args) {
        }
    }


