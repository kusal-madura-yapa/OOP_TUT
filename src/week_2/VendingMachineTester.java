package week_2;

import java.util.Scanner;

public class VendingMachineTester
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {


        VendingMachine machine = new VendingMachine();
        machine.fillUp(10); // fill up with ten cans
        machine.insertToken();
        machine.insertToken();
        System.out.print("Can count = ");
        System.out.println(machine.getTokenCount());
        System.out.print("Token count = ");
        System.out.println(machine.getCanCount());

//        print();


    }
//    public static void menu(){
//        System.out.println("If you want to continue Enter [R] or Enter [Any key] :");
//        String continueIn = input.next();
//        if (continueIn.equals("R")){
//            print();
//        }else {
//            System.exit(0);
//        }
//    }
//
//    public static void print(){
//
//        VendingMachine machine = new VendingMachine();
//
//
//
//        System.out.println(" /--------------------------------------------/\n" +
//                " F : Fill the machine.  \n" +
//                " T : Get the token count. \n" +
//                " C : Get the can count. \n" +
//                " I : insert a token and get a can. \n" +
//                " Q : Quite the program. \n" +
//                "/--------------------------------------------/");
//        String CoustomerIn ="";
//        CoustomerIn=input.next();
//
//
//        switch (CoustomerIn){
//            case "F" :
//                machine.fillUp(10); // fill up with ten cans
//                break;
//            case "T":
//                System.out.print("Token count = ");
//                System.out.println(machine.getTokenCount());
//                break;
//            case "C":
//                System.out.print("Can count = ");
//                System.out.println(machine.getCanCount());
//                break;
//            case "I":
//                machine.insertToken();
//                break;
//            case "Q":
//                System.exit(0);
//                break;
//
//
//        }
//        menu();
//
//    }



}

