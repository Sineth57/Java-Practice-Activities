import java.net.CacheRequest;

public class Vehicle {

    void drive(){
        System.out.println("driving");
    }

    void vehicleBreak(){
        System.out.println("driving");
    }

    void reverse(){
        System.out.println("reverse");
    }

}

class CarO extends  Vehicle{
    void motorRacing(){
        System.out.println("racing");
    }
}

class ModernCar extends CarO{
    void flying(){
        System.out.println("flying");
    }
}


class Boat extends Vehicle{
    void surf(){
        System.out.println("surfing");
    }
}

class ModernBoat extends Boat{
    void LandRidding(){
        System.out.println("Ridding");
    }
}

class TestOutput{
    public static void main(String[] args) {
        ModernBoat mb = new ModernBoat();
        ModernCar mc = new ModernCar();
        mc.drive();
        mc.reverse();
        mc.vehicleBreak();
        mc.motorRacing();
        mc.flying();

        mb.drive();
        mb.vehicleBreak();
        mb.reverse();
        mb.surf();
        mb.LandRidding();   
    }
}