public class CentralBank {

    int getIneresetRate(){
        return 0;
    }
}

class BOC extends CentralBank{
    int getIneresetRate(){
        return 8;
    }
}

class PeoplesBank extends CentralBank{

    @Override
    int getIneresetRate() {
        return 10;
    }
}

class CommercialBank extends  CentralBank{

    @Override
    int getIneresetRate() {
        return 12;
    }
}

class TestOverridding{

    public static void main(String[] args) {

        BOC b = new BOC();
        PeoplesBank p = new PeoplesBank();
        CommercialBank c = new CommercialBank();

        System.out.println("Interest rate:" + b.getIneresetRate());
        System.out.println("Interest rate:" + p.getIneresetRate());
        System.out.println("Interest rate:" + c.getIneresetRate());


    }
}