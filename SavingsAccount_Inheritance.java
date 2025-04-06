class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Interest: " + interest);
    }
}

public class SavingsAccount_Inheritance {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("12345", 5000, 0.03);
        savingsAccount.displayAccountInfo();  
        savingsAccount.calculateInterest(); 
    }
}
