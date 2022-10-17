
//2
public class Employee {

    String name;
    double salary;

    Employee(){
        this.name="Isuru";
        this.salary=1000000;

    }
//    Employee(String name ,int salary){
//        this.name=name;
//        this.salary=salary;
//    }



}

class Main {
    public static void main(String[] args) {

        //without parameter part
        Employee noparameter =new Employee();
        System.out.println("Name : "+noparameter.name);
        System.out.println("$ "+ noparameter.salary);
        //with parameter part
//        Employee em1 = new Employee("Kusal",30000);
//
//        System.out.println("Name : "+em1.name);
//        System.out.println("$ "+em1.salary);
    }
}
