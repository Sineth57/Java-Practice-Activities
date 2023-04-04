public class World {

    String name;
    void process(){
        System.out.println("Earth can rotate");
    }
}

class Earch extends World{

    int area;

    @Override
    void process() {
        System.out.println("Earth is a world");
    }
}

class TestCasting{

    public static void main(String[] args) {
        World w = new Earch();
        w.name = "Earth";
        System.out.println(w.name);
        w.process();


        //downacasting
        Earch e = (Earch) w;
        e.area = 510;
        System.out.println(e.name);
       
        e.process();


    }
}
