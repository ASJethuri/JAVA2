class Room {
    String roomNumber, block, type;

    Room(String r, String b, String t) {
        roomNumber = r; block = b; type = t;
    }
}

class Student1 {
    String name, roll, course;
    Room room;

    Student1(String n, String r, String c, Room room) {
        name = n; roll = r; course = c; this.room = room;
    }

    public String toString() {
        return "Student: " + name + " (" + roll + ") " + course +
               "\nRoom: " + room.roomNumber + " " + room.block + " " + room.type;
    }
}

public class Q11 {
    public static void main(String[] args) {
        Room r = new Room("A101", "Block-B", "Single");
        Student1 s = new Student1("Ravi", "101", "CSE", r);
        System.out.println(s);
    }
}