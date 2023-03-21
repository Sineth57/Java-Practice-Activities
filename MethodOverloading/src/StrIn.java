public class StrIn {

    void display(double a){

        System.out.println("double");
    }

    void display(String b){

        System.out.println("string");
    }

    public static void main(String[] args) {
        StrIn s1 = new StrIn();
        s1.display(34.3d);
        s1.display("Sineth");
    }

}
