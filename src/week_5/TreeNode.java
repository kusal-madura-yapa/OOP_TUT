package week_5;

public class TreeNode implements Node {

    int data;

    TreeNode(int data) {
        this.data = data;
    }

    public void print() {
        System.out.println("data: " + data);
    }
}
class Vertex implements Node {
    int x; // x coordinate
    int y; // y coordinate
    Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void print() {
        System.out.println("x: " + x + ", y: " + y);
    }
}
