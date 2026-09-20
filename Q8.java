abstract class Loan {
    double principal, rate, time;

    Loan(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    abstract double calculateInterest();
}

class HomeLoan extends Loan {
    HomeLoan(double p, double t) {
        super(p, 8, t);
    }

    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

class CarLoan extends Loan {
    CarLoan(double p, double t) {
        super(p, 10, t);
    }

    double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Loan l1 = new HomeLoan(500000, 8);
        Loan l2 = new CarLoan(300000, 5);

        System.out.println("Home Loan Interest: " + l1.calculateInterest());
        System.out.println("Car Loan Interest: " + l2.calculateInterest());
    }
}