package week_4;


    class A {
        void print() {
            System.out.println("print A!");
        }

    }
    class B extends A {
        void print() {
            System.out.println("print B!");
        }
    }
    class C extends A {
        void print() {
            System.out.println("print C!");
        }
    }
    class D extends B {
        void print() {
            System.out.println("print D!");
        }
    }
    public class PTester {
        public static void main(String[] args) {
            A a1 = new A();
            a1.print();
            a1 = new B();
            a1.print();
            a1 = new C();
            a1.print();
            a1 = new D();
            a1.print();
            B b1 = new D();
            b1.print();
            D d1 = (D) b1; // cast line 1
            A a2 = new A();
            d1 = (D) a2; // cast line 2
        }
    }


