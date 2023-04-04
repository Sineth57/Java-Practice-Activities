public class Mobile {

    public void displayName(){
        System.out.println("Smart Mobile");
    }
}

class Samsung extends Mobile{

    public void displayName(){
        System.out.println("SGalaxy");
    }
}

class Apple extends Samsung{

    public void displayName(){
        System.out.println("Iphone 14");
        super.displayName();
    }
}

class Run{

    public static void main(String[] args) {

        Samsung s = new Samsung();
        Apple a = new Apple();

        s.displayName();
        a.displayName();
    }
}
