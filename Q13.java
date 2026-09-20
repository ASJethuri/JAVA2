import java.util.*;

class Guest {
    String name;
    int age;
    String id;

    Guest(String n, int a, String id) {
        name = n; age = a; this.id = id;
    }

    public String toString() {
        return name + "," + age + "," + id;
    }
}

class Reservation {
    String id, roomType;
    List<Guest> guests = new ArrayList<>();

    Reservation(String id, String type) {
        this.id = id; roomType = type;
    }

    void addGuest(Guest g) {
        guests.add(g);
    }

    public String toString() {
        String res = "Reservation ID: " + id + " Room: " + roomType + "\nGuests:\n";
        for (Guest g : guests)
            res += g + "\n";
        return res;
    }
}

public class Q13 {
    public static void main(String[] args) {
        Reservation r = new Reservation("R101", "Deluxe");

        r.addGuest(new Guest("Amit", 25, "ID123"));
        r.addGuest(new Guest("Sara", 22, "ID456"));

        System.out.println(r);
    }
}