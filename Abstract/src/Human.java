abstract class Human {

    Human(){
        System.out.println("constructor is running");
    }
    abstract void eat();
    abstract void walk();
    void breathing(){
        System.out.println("breathinug");
    }
    }
class Man extends Human{
    @Override
    void eat() {
        System.out.println("anything eat");
    }

    @Override
    void walk() {
        System.out.println("any kind of walk");
    }

    @Override
    void breathing() {
        super.breathing();
        System.out.println("lubdub");
    }
}

class Sineth extends Man{
    @Override
    void breathing() {
        super.breathing();
        System.out.println("greatihng sineth");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("eating foods");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("running");
    }
}

class Running{
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Sineth();
        Man m = new Sineth();

        h.breathing();
        h.eat();
        h.walk();

        h1.eat();
        h1.walk();
        h1.breathing();
    }
}