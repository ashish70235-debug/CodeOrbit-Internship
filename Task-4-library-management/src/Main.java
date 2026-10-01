import java.util.InputMismatchException;
import java.util.Scanner;

class Main{

    static int getNumber(Scanner sc){
        while(true){
            try{
                return sc.nextInt();
            }
            catch( InputMismatchException e){
                System.out.println("Please enter a valid number.");
                sc.next();
            }
        }
    }



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do{

            System.out.println("\n========== LIBRARY MANAGEMENT SYSTEM =============");
            System.out.println("1. Add book");
            System.out.println("2. Display");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice : ");

            choice = getNumber(sc);
            System.out.println();

            switch (choice){

                case 1: System.out.print("Enter Book Id: ");
                int id = getNumber(sc);

                sc.nextLine();

                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Author Name: ");
                String author = sc.nextLine();

                if(title.isEmpty() || author.isEmpty()){
                    System.out.println("Book Title or Author can't be empty");
                    break;
                }

                library.addBook(id,title,author);
                break;

                case 2 : library.displayBooks();
                break;

                case 3: System.out.print("Enter Book Id to Search: ");
                        int searchId = getNumber(sc);

                        library.searchBook(searchId);
                break;

                case 4: System.out.print("Enter Book Id to issue: ");
                    int issueId = getNumber(sc);

                    library.issueBook(issueId);
                    break;

                case 5: System.out.print("Enter Book Id to Return: ");
                    int returnId = getNumber(sc);

                    library.returnBook(returnId);
                    break;

                case 6: System.out.println("Thankyou for using the library Management System.");
                break;

                default : System.out.println("Invalid choice");
            }

        }while( choice != 6);

        sc.close();


    }
}