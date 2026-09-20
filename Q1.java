import java.util.*;

class Professor {
    private String name, employeeId, specialization;

    public Professor(String name, String employeeId, String specialization) {
        this.name = name;
        this.employeeId = employeeId;
        this.specialization = specialization;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + employeeId + ", Specialization: " + specialization;
    }
}

class Department {
    private String deptName, hodName;
    private List<Professor> professors = new ArrayList<>();

    public Department(String deptName, String hodName) {
        this.deptName = deptName;
        this.hodName = hodName;
    }

    public void addProfessor(Professor p) {
        professors.add(p);
    }

    public String toString() {
        String res = "Department: " + deptName + "\nHOD: " + hodName + "\nProfessors:\n";
        for (Professor p : professors) res += p + "\n";
        return res;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Department d = new Department("Computer Science", "Dr. Mehta");
        d.addProfessor(new Professor("Arjun", "P101", "AI"));
        d.addProfessor(new Professor("Neha", "P102", "ML"));
        System.out.println(d);
    }
}