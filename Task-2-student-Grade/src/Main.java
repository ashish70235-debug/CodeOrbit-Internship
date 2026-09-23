import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter no of students: ");
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


//        System.out.println("Student details:");
//        for( Student student : students){
//            System.out.println("Name:"+student.name);
//            System.out.println("Marks:"+student.marks);
//            System.out.println();
//        }


        double total = 0.0;
        double highest = students.getFirst().marks;
        double lowest = students.getFirst().marks;

        for( Student student : students){
            total += student.marks;

            if( student.marks > highest){
                highest = student.marks;
            }

            if( student.marks < lowest) {
                lowest = student.marks;
            }
        }

        double average = total/students.size();

        System.out.print("============= STUDENT SUMMARY REPORT ===============\n\n");

        System.out.printf("%-20s %-10s%n", "Student Name", "Marks");
        System.out.println("-----------------------------------");


        for( Student student : students){
            System.out.printf("%-20s %-10.2f%n", student.name, student.marks);
        }

        System.out.println("------------------------------------");

        System.out.printf("Average Marks : %.2f%n", average);
        System.out.printf("Highest Marks : %.2f%n", highest);
        System.out.printf("Lowest Marks  : %.2f%n", lowest);

        System.out.println("====================================");

    }
}
