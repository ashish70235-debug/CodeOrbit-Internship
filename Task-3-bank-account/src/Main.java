import java.util.Scanner;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // for taking input

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        BankAccount account = new BankAccount(name); // Create object of BankAccount class

        System.out.print("Enter Initial deposit: ");
        double initialDeposit = sc.nextDouble();

        account.deposit(initialDeposit);

        int choice;

        do{
            System.out.println("\n===============BANK ACCOUNT================");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter Your choice: ");


            choice = sc.nextInt();

            switch(choice){

                case 1: System.out.print("Enter deposit amount: ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                break;

                case 2: System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = sc.nextDouble();
                account.withdraw(withdrawalAmount);
                break;

                case 3: System.out.printf("Current balance: %.2f%n",account.checkBalance());
                break;

                case 4: account.showTransactionHistory();
                System.out.println("-------------------------------------------");
                System.out.printf("Final balance: ₹%.2f%n%n",account.checkBalance());
                System.out.println("Thankyou for using the bank account system.");
                break;

                default: System.out.println("Enter a valid choice.");

            }
        } while( choice != 4);

        sc.close();
    }
}