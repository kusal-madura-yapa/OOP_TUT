package week_3;

//4
class Cat {
        private String colour;
        public Cat(String colour1) {
            colour = colour1;
        }
        public String getColour() {
            return colour;
        }
        public void setColour(String colour1) {
            colour = colour1;
        }
        // creates a new Cat object and returns it to the caller
        public Cat create() {
            Cat c = new Cat("Brown");
            System.out.println("\nInside Cat.create(), address of created cat object c is: " + c);
            return c;
        }
    }
    class Mutator {
        void mutate(Cat cat) {
            cat.setColour("Pink");
        }
    }
    public class ReferenceCopyExample {
        public static void main(String[] args) {
            Cat c1 = new Cat("Gray");
            Mutator mutator = new Mutator();
            mutator.mutate(c1);
            System.out.println("\nAfter mutate() is called, colour of cat c1 is: " + c1.getColour());
            Cat c2 = new Cat("Black"); // create a new cat object

            System.out.println("After creation of cat c2");
            System.out.println("Memory address of object c1 is: " + c1);
            System.out.println("Memory address of object c2 is: " + c2 + "\n\n");
            c2 = c1; // copy reference of c1 to c2
            System.out.println("After assignment c2 = c1;");
            System.out.println("Memory address of object c1 is: " + c1);
            System.out.println("Memory address of object c2 is: " + c2);
            c2.setColour("Yellow"); // set the colour of c2 to be yellow
            System.out.println("\n\nAfter c2.setColour(\"Yellow\")");
            System.out.println("Colour of c1 is: " + c1.getColour());
            System.out.println("Colour of c2 is: " + c2.getColour());
            Cat c3 = c1.create();
            System.out.println("Address of c3 is: " + c3);
        }
    }

