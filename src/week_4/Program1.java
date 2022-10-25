package week_4;

package myfirst;
public class P {
    public double x;
    protected double y;
    private double z;
    double w;
    public void foo() {
        x = 2.1; // line 11
        y = 3.1; // line 12
        z = 4.1; // line 13
        w = 5.1; // line 14
    }
}
    File Program1.java contains:
        package myfirst;
class Q extends P {
    public void bar() {
        x = 2.2; // line 20
        y = 3.2; // line 21
        z = 4.2; // line 22
        w = 5.2; // line 23
        P p1 = new P();
        p1.x = 2.2; // line 26
        p1.y = 3.2; // line 27
        p1.z = 4.2; // line 28
        p1.w = 5.2; // line 29
    }
}
class R extends Q {
    public void bar2() {
        x = 2.3; // line 35
        y = 3.3; // line 36
        z = 4.3; // line 37
        6
        w = 5.3; // line 38
        P p2 = new P();
        p2.x = 2.3; // line 41
        p2.y = 3.3; // line 42
        p2.z = 4.3; // line 43
        p2.w = 5.3; // line 44
    }
}
public class Program1 {
    public static void main(String[] args) {
        P p3 = new P();
        p3.x = 2.4; // line 51
        p3.y = 3.4; // line 52
        p3.z = 4.4; // line 53
        p3.w = 5.4; // line 54
    }
}
    File Program2.java contains:
        package mysecond;
        import myfirst.P;
class S extends P {
    public void bar() {
        x = 2.5; // line 8
        y = 3.5; // line 9
        z = 4.5; // line 10
        w = 5.5; // line 11
        P p4 = new P();
        p4.x = 2.5; // line 14
        p4.y = 3.5; // line 15
        p4.z = 4.5; // line 16
        p4.w = 5.5; // line 17
    }
}
public class Program2 {
    public static void main(String[] args) {
        P p5 = new P();
        p5.x = 2.6; // line 24
        p5.y = 3.6; // line 25
        p5.z = 4.6; // line 26
        p5.w = 5.6; // line 27
    }
}
