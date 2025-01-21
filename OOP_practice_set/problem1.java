// Bank Account (method like deposit , withdraw , check balance)

package OOP_practice_set ;

import java.util.Scanner;

class BankAccount {           // class and declared multiple datat types
    String Bankname;
    String accountholdername;
    double accountnumber;
    double balance;
    double withdraw;
    double deposit;

   public void deposit(double deposit) {      // deposit function
    balance += deposit;                       // update the balance
        System.out.println("Succesfully Deposited " + deposit);
    }
    public void withdraw(double withdraw) {   // withdraw function
        if(balance >= withdraw) {             // if condition to withdraw the fund
            balance -= withdraw;              // - the amount you withdraw from the balace left
            System.out.println("Withdrawed Succesfully : " + withdraw);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }
    public void balance() {                  // balance function
        System.out.println("Your Balance : " + balance);
    }

}
public class problem1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        BankAccount Acc = new BankAccount();
    
        System.out.println("        DETAILS");
        System.out.println("----------------------");
        System.out.println();

        System.out.println("ACCOUNT HOLDER NAME ");
        String accountholdername = sc.nextLine();
        System.out.println(accountholdername );

        System.out.println("ACCOUNT NUMBER " );
        long accountnumber = sc.nextLong ();
        System.out.println(accountnumber);

        while(true){            // to continue the procedure
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("Choose the Option");
        int select = sc.nextInt();

        switch (select) {      // switch statment

            case 1: 
            System.out.println("Enter Amount to be Deposit :");
                double Deposit = sc.nextDouble();
                Acc.deposit(Deposit);
                break;
            case 2:
            System.out.println("Enter Amount to be Withraw :");
            double Withdraw = sc. nextDouble();
            Acc.withdraw(Withdraw);
                break;
            case 3:
            System.out.println("Balance is");
            Acc.balance();
                break;
            case 4:
            System.out.println("Thank you!!");
            sc.close();
            return;
                
            default : 
            System.out.println("Invalid !!");


        }
        }
    }
}
