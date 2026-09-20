interface Device {
    void turnOn();
    void turnOff();
}

class Fan implements Device {
    public void turnOn() { System.out.println("Fan is now ON"); }
    public void turnOff() { System.out.println("Fan is now OFF"); }
}

class Light implements Device {
    public void turnOn() { System.out.println("Light is now ON"); }
    public void turnOff() { System.out.println("Light is now OFF"); }
}

public class Q10 {
    public static void main(String[] args) {
        Device d1 = new Fan();
        Device d2 = new Light();

        d1.turnOn(); d1.turnOff();
        d2.turnOn(); d2.turnOff();
    }
}