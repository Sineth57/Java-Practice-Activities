public class GrandFather {

    void swim(){
        System.out.println("Swimming");
    }
}

class Father extends GrandFather{
    @Override
    void swim() {
        System.out.println("Swimmingn in river");
    }
}

class Son extends Father{
    @Override
    void swim() {
        System.out.println("Swimminng in pool");
    }

    public static void main(String[] args) {
        GrandFather gf,f,s;  //here f is a variable name in GrandFather class
        f = new GrandFather();
        s = new Father();
        gf = new Son();
        gf.swim();
        f.swim();
        s.swim();

    }
}
