package week_6;
import java.util.*;




    class Board {
        int ar[][];
        // creates a nxn size board
        public Board(int n) {
            ar = new int[n][n];
// fill in array with random ints in the range [0, 100]
            Random generator = new Random();
            for (int i=0; i < n; i++)
                for (int j=0; j < n; j++)
                    ar[i][j] = generator.nextInt(101);
        }
        // display the contents of the board
        public void print() {
            for (int[] r : ar) { // for all rows
                for (int c : r) // for every element in current row
                    System.out.print(c + " ");
                System.out.println();
            }
        }
        public int findMaxInRow(int row){
            // initialing the max number for max variable
            int max = 0;


            // raw number and the array index because of that give the number of row-1
            for (int i = 0; i < ar[row-1].length; i++){

                //2D array give the [raw][column]
                // i increment the colum number
                if (ar[row-1][i] > max)
                    // if that value greater than the assigned max value
                    max = ar[row-1][i]; // assign to the  max variable

            }
            // otherwise, give the maximum value
            return  max;

        }

        public int findMaxInColumn(int column){
            int max = 0;
            for (int i = 0; i < ar.length; i++){

                // same as the raw array concept understand here is [raw value ] [colum value ]
                if (ar[i][column-1] > max){
                    max = ar[i][column-1];
                }
            }
            return max;
        }

        public int findMaxInDiagonal(){
            int max = 0;
            // give max
            int x = ar.length;
            // get the array size
            int y = 0;

            for (int dioganI = 0; dioganI < ar.length; dioganI++){
                int iter2 = y;
                //upper diagonal
                for (int i = 0; i < x; i++){
                    // i is incrementing
                    if (ar[i][iter2] > max){
                        max = ar[i][iter2];
                    }
                    //lower diagonal
                    if ( y != 0){
                        if (ar[iter2][i] > max){
                            max = ar[iter2][i];
                        }
                    }
                    iter2++;
                }
                x--;
                y++;
            }
            return max;
        }
    }

    public class Q1 {
        public static void main(String[] args) {
            Board board1 = new Board(5);
            board1.print();

            System.out.println(".......................................");
            System.out.println("Max in Row 1 : "+board1.findMaxInRow(1));
            System.out.println("Max in Row 2 : "+board1.findMaxInRow(2));
            System.out.println("Max in Row 3 : "+board1.findMaxInRow(3));
            System.out.println("Max in Row 4 : "+board1.findMaxInRow(4));
            System.out.println("Max in Row 5 : "+board1.findMaxInRow(5));
            System.out.println(".......................................");


            System.out.println("Max in column: "+board1.findMaxInColumn(1));
            System.out.println("Max in column: "+board1.findMaxInColumn(2));
            System.out.println("Max in column: "+board1.findMaxInColumn(3));
            System.out.println("Max in column: "+board1.findMaxInColumn(4));
            System.out.println("Max in column: "+board1.findMaxInColumn(5));
            System.out.println(".......................................");
            System.out.println("Max in diagonal: "+board1.findMaxInDiagonal());
        }
    }


