package week_5;

public class NodeTest {
    static void printLabel(Node n) {
        if (n instanceof TreeNode)
            System.out.print("Tree-node-> ");
        else if (n instanceof Vertex)
            System.out.print("Vertex-> ");
        n.print();
    }
    public static void main(String[] args) {
        Node n1 = new TreeNode(100);
        Node n2 = new Vertex(500, 400);
        printLabel(n1);
        printLabel(n2);
    }
    // instance of saying that the actual object belongs to the class
    // this. say the comforter the using the class variable clearly good habit
    // static is call that the owen [belongs to the class ]
    // instance variables are belongs to every object
}