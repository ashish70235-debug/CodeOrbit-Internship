import java.util.InputMismatchException;
import java.util.Scanner;

// all calculation in this class
class Calculation {

    static double add( double a, double b){
        return a+b;
    }

    static double sub( double a, double b){
        return a-b;
    }

    static double mul( double a, double b){
        return a*b;
    }

    static void div( double a, double b){
        //handling exception
        if( b == 0 ){
            System.out.println("Can't divide by zero");
            return;
        }
        System.out.println("Result : " +(a/b));

    }

}

class Main{

    static double getNumber(Scanner sc) {

        while (true) {
            try {
                return sc.nextDouble();
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a valid number!");
                sc.next();
            }
        }
    }

    static int getChoice(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a valid choice!");
                sc.next();
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double result;

        //Taking input num1 & num 2
        System.out.print("Enter 1st number: ");
        double firstNum = getNumber(sc);

        System.out.print("Enter 2nd number: ");
        double secondNum = getNumber(sc);

        //asking for user choice
        System.out.println("\nChoose an Operation:\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n");


        System.out.print("Enter your choice: ");
        int choice = getChoice(sc);

        //Logic
        switch (choice){

            case 1:
                result = Calculation.add(firstNum,secondNum);
                System.out.println("Result : " +result);
                break;

            case 2:
                result = Calculation.sub(firstNum,secondNum);
                System.out.println("Result : " +result);
                break;

            case 3:
                result = Calculation.mul(firstNum,secondNum);
                System.out.println("Result : " +result);
                break;

            case 4:
                Calculation.div(firstNum,secondNum);
                break;

            default:
                System.out.println("Invalid Operation");

        }

        sc.close();
    }

}
