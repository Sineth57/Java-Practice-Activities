public class Static {

    int multiply(int a,int b){
        return a*b;
    }

    static int sum(int a, int  b){
    return a+b;
    }
}

class Test{
    public static void main(String[] args) {
        Static s = new Static();

        System.out.println(s.multiply(4,8));
    }
}
