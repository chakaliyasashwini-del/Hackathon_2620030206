import java.util.Scanner;
class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;
    BankAccount(String accNum, String name, double bal) {
        accountNumber = accNum;
        accountHolderName = name;
        balance = bal;
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    double checkBalance() {
        return balance;
    }
    void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();
        BankAccount account = new BankAccount(accNum, name, bal);
        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        account.deposit(dep);
        System.out.print("Enter amount to withdraw: ");
        double w = sc.nextDouble();
        account.withdraw(w);
        account.displayAccount();
    }
}
