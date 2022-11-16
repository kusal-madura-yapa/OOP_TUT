package week_5;

class Cell2 {
    int x;
    Cell2(int x) {
        this.x = x;
        System.out.println("Cell2 constructor called");
    }
}
class TinyCell2 extends Cell2 {
    TinyCell2() {
        super(5);
// missing line goes here
        System.out.println("TinyCell2 constructor called");
    }
}
class MicroscopicCell extends TinyCell2 {
    MicroscopicCell() {
        System.out.println("MicroscopicCell constructor called");
    }
}
public class CellTest2 {
    public static void main(String[] args) {
        Cell2 c = new MicroscopicCell();
    }
}