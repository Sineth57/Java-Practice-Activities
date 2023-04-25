public class TestStatic {

    static int age;

    static void show(){
        System.out.println("this is static method");
    }

    public static void main(String[] args) {

        age = 25;
        System.out.println("age is " + age);
        show();
    }
}
