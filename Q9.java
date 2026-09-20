class Course {
    String courseName, duration;

    Course(String n, String d) {
        courseName = n;
        duration = d;
    }
}

class Student {
    String name;
    Course course;

    Student(String n, Course c) {
        name = n;
        course = c;
    }

    public String toString() {
        return "Student: " + name + " Course: " + course.courseName + " (" + course.duration + ")";
    }
}

class PremiumStudent extends Student {
    int discount;

    PremiumStudent(String n, Course c, int d) {
        super(n, c);
        discount = d;
    }

    public String toString() {
        return "Premium Student: " + name + " Course: " + course.courseName +
               " (" + course.duration + ") Discount: " + discount + "%";
    }
}

public class Q9 {
    public static void main(String[] args) {
        Course c = new Course("Java", "3 months");

        System.out.println(new Student("Arjun", c));
        System.out.println(new PremiumStudent("Meena", c, 20));
    }
}