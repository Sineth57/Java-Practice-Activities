public class Sephian {
    void status(){
        System.out.println("live object");
    }
}

class Human extends Sephian{
    @Override
    void status() {
        System.out.println("Human is live object");
    }
}

class Man extends Human{
    @Override
    void status() {
        System.out.println("Man is live object");
    }
}

class Sineth extends Man{
    @Override
    void status() {
        System.out.println("Sineth is live object");
    }
}

class Test{
    public static void main(String[] args) {
        Sephian s = new Sephian();
        Sephian h = new Human();
        Sephian m = new Man();
        Sephian si = new Sineth();

        s.status();
        h.status();
        m.status();
        si.status();
    }
}