class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Doctor extends Person {
    protected String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }
}

class Surgeon extends Doctor {
    private String surgeryType;

    public Surgeon(String name, int age, String specialization, String surgeryType) {
        super(name, age, specialization);
        this.surgeryType = surgeryType;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age +
               "\nSpecialization: " + specialization +
               "\nSurgery Type: " + surgeryType;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Surgeon s = new Surgeon("John", 40, "Cardiology", "Heart Surgery");
        System.out.println(s);
    }
}