import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter no of students:");
        int n = sc.nextInt();

        for( int  i = 0 ; i < n ; i++){

            Student student = new Student();

            System.out.print("Enter Name: ");
            student.name = sc.next();

            System.out.print("Enter Marks: ");
            student.marks = sc.nextDouble();

            System.out.println();

            students.add(student);
        }


        System.out.println("Student details:");
        for( Student student : students){
            System.out.println("Name:"+student.name);
            System.out.println("Marks:"+student.marks);
            System.out.println();
        }
    }
}
