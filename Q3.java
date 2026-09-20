class Employee {
    String name, id;
    double basicSalary;

    Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.basicSalary = salary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    public String toString() {
        return "Employee " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    double calculateSalary() {
        return basicSalary + bonus;
    }

    public String toString() {
        return "Manager " + name + " (" + id + ") Salary: " + calculateSalary();
    }
}

public class Q3 {
    public static void main(String[] args) {
        System.out.println(new Employee("Ravi", "E101", 30000));
        System.out.println(new Manager("Seema", "M202", 40000, 5000));
    }
}