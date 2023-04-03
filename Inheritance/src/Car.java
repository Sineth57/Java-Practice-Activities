public class Car {
    Car(){
        System.out.println("Welcome");
    }

    static void meth1(int x,int y){
        System.out.println("wheels" + x + y);
    }

    static void meth1(){
        System.out.println("Modern");
    }


}

class NewCar extends Car{
    String name = "Srilankan";

    public static void main(String[] args) {
        meth1(3,4);
    }
}
