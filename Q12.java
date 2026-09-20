class Vehicle {
    String regNo, brand;
    double baseRate;

    Vehicle(String r, String b, double rate) {
        regNo = r; brand = b; baseRate = rate;
    }

    double calculateRent() { return baseRate; }
}

class Car extends Vehicle {
    Car(String r, String b, double rate) {
        super(r, b, rate);
    }

    double calculateRent() {
        return baseRate * 1.5;
    }
}

class Bike extends Vehicle {
    Bike(String r, String b, double rate) {
        super(r, b, rate);
    }

    double calculateRent() {
        return baseRate * 1.2;
    }
}

public class Q12 {
    public static void main(String[] args) {
        Vehicle v1 = new Car("KA01AA1234", "Toyota", 1000);
        Vehicle v2 = new Bike("KA05BB6789", "Honda", 500);

        System.out.println("Car " + v1.regNo + " " + v1.brand + " Rent: " + v1.calculateRent());
        System.out.println("Bike " + v2.regNo + " " + v2.brand + " Rent: " + v2.calculateRent());
    }
}