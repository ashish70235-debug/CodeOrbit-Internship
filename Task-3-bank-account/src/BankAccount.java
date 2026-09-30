import java.util.ArrayList;

class BankAccount {
    private String accountHolder;   // Instance variables
    private double balance ;

    private ArrayList<String> transactions = new ArrayList<>(); // Private arrayList

    // Constructor that will initialize the object data
    BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount <= 0) {   // Deposit amount should not be less than zero
            System.out.println("Deposit amount must be greater than 0.");
        }
        balance += amount;

        transactions.add("Deposit: ₹" + amount);

        System.out.println("Deposit Successful!");
    }

    // withdraw method
    void withdraw(double amount){
        if( amount <= 0 ){     //Handling the case (When amount to be withdraw is less than 0)
            System.out.println("Withdrawal amount must be greater than 0.");
        }

        else if ( amount > balance ){  // when Account balance is less than withdrawal amount, it is not going to perform
            System.out.println("Insufficient balance.");
        }
        else {
            balance -= amount;
            transactions.add("Withdraw: ₹"+amount);

            System.out.println("Withdrawal Successful!");
        }
    }

    // Method to current balance
    double checkBalance(){
        return balance;
    }


    // Method that will show the transaction history
    void showTransactionHistory(){
        System.out.println();
        System.out.println("=================TRANSACTION HISTORY==================\n");
        if( transactions.isEmpty()){
            System.out.println("No transaction found.");
        }

        else{
            for(String transaction : transactions){
                System.out.println(transaction);
            }
        }

    }
}

