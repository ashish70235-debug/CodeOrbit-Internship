import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

    // Validating the input
    static int getNumber(Scanner sc){

       while(true){
           try{
               int n = sc.nextInt();

               if(n > 0){
                   return n;
               }

               System.out.println("Number of student must be greater than Zero!");
           }
           catch(InputMismatchException e){
               System.out.println("Enter a valid number!");
               sc.next();
           }
       }

    }

    static String getNames(Scanner sc){

        sc.nextLine();
        while(true){
            String name = sc.nextLine().trim();


            if(!name.isEmpty() && name.matches("[a-zA-Z ]+")){
                return name;
            }

            System.out.println("Enter a valid Name!");
        }
    }

    static double getMarks(Scanner sc){
        while(true){

            try{
                double marks = sc.nextDouble();
                if( marks >= 0 && marks <= 100){
                    return marks;
                }

                System.out.println("Marks must be between 0 and 100");
            }

            catch(InputMismatchException e){
                System.out.println("Enter a valid number!");
                sc.next();
            }
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Creating an arraylist for storing students
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter no of students: ");
        int n = getNumber(sc);


        // Creating objects and taking inputs(Name, marks)
        for( int  i = 0 ; i < n ; i++){

            Student student = new Student();

            System.out.print("Enter Name: ");
            student.name = getNames(sc);

            System.out.print("Enter Marks: ");
            student.marks = getMarks(sc);

            System.out.println();

            students.add(student);
        }

        double total = 0.0;
        double highest = students.getFirst().marks;
        double lowest = students.getFirst().marks;

        //calculation part (Avg, Total, Max, Min) -- Marks
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

        // Student summary report
        System.out.print("============= STUDENT SUMMARY REPORT ===============\n\n");

        System.out.printf("%-30s %-10s%n", "Student Name", "Marks");
        System.out.println("-----------------------------------");


        for( Student student : students){
            System.out.printf("%-30s %-10.2f%n", student.name, student.marks);
        }

        System.out.println("------------------------------------");

        System.out.printf("Average Marks : %.2f%n", average);
        System.out.printf("Highest Marks : %.2f%n", highest);
        System.out.printf("Lowest Marks  : %.2f%n", lowest);

        System.out.println("====================================");

    }
}
