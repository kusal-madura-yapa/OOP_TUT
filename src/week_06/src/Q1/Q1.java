package Q1;

import java.util.*;


class Board {
    int ar[][];

    /**
     * generate oven document commenting
     * doc type comment
     * /
     */
    // creates a nxn size board
    public Board(int n) {
        ar = new int[n][n];
// fill in array with random ints in the range [0, 100]
        Random generator = new Random();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
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

    public int findMaxInRow(int row) {
        // initialing the max number for max variable
        int max = 0;


        // raw number and the array index because of that give the number of row-1
        for (int i = 0; i < ar[row - 1].length; i++) {

            //2D array give the [raw][column]
            // i increment the colum number
            if (ar[row - 1][i] > max)
                // if that value greater than the assigned max value
                max = ar[row - 1][i]; // assign to the  max variable

        }
        // otherwise, give the maximum value
        return max;

    }

    public int findMaxInColumn(int column) {


        int max = 0;
        for (int i = 0; i < ar.length; i++) {

            // same as the raw array concept understand here is [raw value ] [colum value ]
            if (ar[i][column - 1] > max) {
                max = ar[i][column - 1];
            }
        }
        return max;
    }

    /* return max across all diagonals, i.e. return the max
of all array elements */
    int findMaxInDiagonal() {
        int max = Integer.MIN_VALUE;
        for (int[] r : ar) // for all rows
            for (int c : r) // for every element in current row
                if (max < c)
                    max = c;
        return max;
    }
}


public class Q1 {
    public static void main(String[] args) {
        Board board1 = new Board(5);
        board1.print();
//            System.out.println(board1.rr[-1]);
//            System.out.println(board1.rr[-2]);

        System.out.println(".......................................");
        System.out.println("Max in Row 1 : " + board1.findMaxInRow(1));
        System.out.println("Max in Row 2 : " + board1.findMaxInRow(2));
        System.out.println("Max in Row 3 : " + board1.findMaxInRow(3));
        System.out.println("Max in Row 4 : " + board1.findMaxInRow(4));
        System.out.println("Max in Row 5 : " + board1.findMaxInRow(5));
        System.out.println(".......................................");


        System.out.println("Max in column 1 : " + board1.findMaxInColumn(1));
        System.out.println("Max in column 2 : " + board1.findMaxInColumn(2));
        System.out.println("Max in column 3 : " + board1.findMaxInColumn(3));
        System.out.println("Max in column 4 : " + board1.findMaxInColumn(4));
        System.out.println("Max in column 5 : " + board1.findMaxInColumn(5));

        System.out.println(".......................................");

        System.out.println("Max Diagonal : " + board1.findMaxInDiagonal());
    }
}


//System.out.println("Max in diagonal: "+board1.findMaxInDiagonal());

