import java.util.Scanner;

// Interface
interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}

// Parent Class
class BankAccount {
    int accNo;
    String name;
    double balance;

    // Constructor
    BankAccount(int accNo, String name, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
    }
}

// Child Class (Inheritance + Interface Implementation)
class Customer extends BankAccount implements BankOperations {

    Customer(int accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    // Method Overriding
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main Class
public class BankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Customer c = new Customer(101, "Jahnvi", 5000);

        c.displayDetails();

        while(true) {

            System.out.println("\n1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Check Balance");
            System.out.println("4 Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    double d = sc.nextDouble();
                    c.deposit(d);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double w = sc.nextDouble();
                    c.withdraw(w);
                    break;

                case 3:
                    c.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
