package week_3;

public class Car {
    private String licensePlate;
    private double speed; // kilometers per hour
    private double maxSpeed; // kilometers per hour
    // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        }
        else {
            maxSpeed = 0.0;
        }
    }

    // constructors
    public Car(String licensePlate1, double maxSpeed1 ,double speed1) {
        this.licensePlate = licensePlate1;

        if (speed1 > maxSpeed1) {
            maxSpeed1= speed;
        }
        else {
            speed = 0.0;
        }
    }

    void print (){
//        current speed
        System.out.println("Current speed "+this.speed);
//        max speed
        System.out.println("Maximum speed "+this.maxSpeed);
        // license plate
        System.out.println("License plate "+this.licensePlate);
    }
}

class test {
    public static void main(String[] args) {
        Car mycar = new Car("KU 3333",100);
        mycar.print();
        System.out.println("    ");
        Car kusalcar = new Car("VU 3333",100,160);
        kusalcar.print();
    }
}
// get key word use  next week 7 and 8