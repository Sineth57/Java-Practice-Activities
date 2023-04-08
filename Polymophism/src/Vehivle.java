public class Vehivle {

    void drive(){
        System.out.println("Drive speed limit 100 kmph");
    }
}

class Car extends Vehivle{
    @Override
    void drive() {
        System.out.println("Drive speed limit 150kmph");
    }
}

class RunProgramme{
    public static void main(String[] args) {
        Vehivle c = new Car();
        Vehivle v = new Vehivle();
        c.drive();
        v.drive();
    }
}