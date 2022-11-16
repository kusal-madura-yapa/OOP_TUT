package week_5;

class Cell {
    Cell() {
        System.out.println("Cell constructor called");
    }
}
class TinyCell extends Cell {
    TinyCell() {
        System.out.println("TinyCell constructor called");
    }
}
class MicroscopicCell1 extends TinyCell {
    MicroscopicCell1() {
        System.out.println("MicroscopicCell constructor called");
    }
}
public class CellTest {
    public static void main(String[] args) {
        Cell c = new MicroscopicCell1();
    }
}