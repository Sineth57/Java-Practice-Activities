public class Parent {

    String name;

    void display(){
        System.out.println("Super class is running");
    }
}

class Child extends Parent{

    int age;

    @Override
    void display() {
        System.out.println("Sub class is running");
    }
}

class Downcasting{

    public static void main(String[] args) {
        Parent p = new Child(); //upcasting object
        p.name = "Sineth";

        Child c = (Child) p; //downcating object
        c.age = 23;

        System.out.println(c.name);
        System.out.println(c.age);
        c.display();

    }
}
