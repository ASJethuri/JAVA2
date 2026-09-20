abstract class Flight {
    String flightNumber, airline;
    double fare;

    Flight(String f, String a, double fare) {
        this.flightNumber = f;
        this.airline = a;
        this.fare = fare;
    }

    abstract void calculateFare();

    public String toString() {
        return "Flight No: " + flightNumber + " Airline: " + airline + " Fare: " + fare;
    }
}

class DomesticFlight extends Flight {
    DomesticFlight(String f, String a, double fare) {
        super(f, a, fare);
    }
    void calculateFare() {
        fare += fare * 0.10;
    }
}

class InternationalFlight extends Flight {
    InternationalFlight(String f, String a, double fare) {
        super(f, a, fare);
    }
    void calculateFare() {
        fare += fare * 0.25;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Flight f1 = new DomesticFlight("AI202", "Air India", 5000);
        Flight f2 = new InternationalFlight("QF101", "Qantas", 20000);

        f1.calculateFare();
        f2.calculateFare();

        System.out.println(f1);
        System.out.println(f2);
    }
}