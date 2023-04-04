public class Animal {

    String name;

    public void setName(){
        System.out.println("Elephant");
    }
}

class Fish extends Animal{
    String color;

    @Override
    public void setName() {
        System.out.println("Blue Fish");
    }
}

class Run{

        public static void main(String[] args) {

        Animal a = new Fish();
        a.name = "Alaguduwa";

        Fish f = new Fish();
        f.name = "linna";
        f.color = "grey";

        System.out.println("Sub class object");
            System.out.println("Name : " + a.name);
            a.setName();
            System.out.println("Super class object");
            System.out.println("Name: "+ f.name);
            System.out.println("Color: " + f.color);
    }
}
