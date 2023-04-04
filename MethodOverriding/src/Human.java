public class Human {
    void run(){
        System.out.println("can eat");
    }
}

class Sineth extends Human{

    @Override
    void run() {
        System.out.println("I can eat");
    }

    public static void main(String[] args) {
        Sineth s = new Sineth();
        s.run();

    }
}
