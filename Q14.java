class Account {
    private double balance;

    public void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt);
    }

    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Q14 {
    public static void main(String[] args) {
        Account a = new Account();

        a.deposit(1000);
        a.withdraw(500);
        System.out.println("Balance: " + a.getBalance());
    }
}