public abstract class Vehicle {
    Vehicle() {
        System.out.println("Vehicle Constructor Called");
    }
    abstract public void start();
    public void fuel() {
        System.out.println("Fuel Type of Vehicle is Petrol");
    }
}

class Bike extends Vehicle{
    @Override
    public void start(){
        System.out.println("Bike is Started");
    }
    public static void main(String[] args) {
        Vehicle vehicle=new Bike();
        vehicle.fuel();
        vehicle.start();

    }
}
