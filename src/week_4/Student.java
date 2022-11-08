package week_4;

public class Student implements Printable{
    String name = " Kusal ";
//    char[] JavaCharArray = new char[5];
    String [] GradeArray = {"A","B"};

    @Override
    public void print() {
        System.out.println(name);
        for (int i=0;i<GradeArray.length;i++){
            System.out.println(GradeArray[i]);
        }
    }
}
