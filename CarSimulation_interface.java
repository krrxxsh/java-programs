interface Vehicle {
    void drive();
}

interface Engine {
    void startEngine();
}

class Car implements Vehicle, Engine {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
}

public class CarSimulation_interface {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine(); 
        car.drive();        
    }
}
