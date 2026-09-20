class Passport {
    String passportNo, issueDate, expiryDate;

    Passport(String p, String i, String e) {
        passportNo = p; issueDate = i; expiryDate = e;
    }
}

class Citizen {
    String name, dob, address;
    Passport passport;

    Citizen(String n, String d, String a, Passport p) {
        name = n; dob = d; address = a; passport = p;
    }

    public String toString() {
        return "Citizen: " + name + " DOB: " + dob + " Address: " + address +
               "\nPassport: " + passport.passportNo +
               " Issue: " + passport.issueDate +
               " Expiry: " + passport.expiryDate;
    }
}

public class Q15 {
    public static void main(String[] args) {
        Passport p = new Passport("P123456", "01-01-2020", "01-01-2030");
        Citizen c = new Citizen("Ravi", "01-01-1990", "Delhi", p);

        System.out.println(c);
    }
}