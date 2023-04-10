public class CentralBank {
    void leasingRate(){
        System.out.println("below 30%");
    }
}

class CommercialBank extends CentralBank{

    void HousingRate(){

    }
    @Override
    void leasingRate() {
        System.out.println("25%");
    }
}

class Commercialleasing extends CommercialBank{
    @Override
    void leasingRate() {
        System.out.println("23%");
    }
}

class CommercialCredit extends CommercialBank{
    @Override
    void leasingRate() {
        System.out.println("22");
    }
}
    void housingLoanRate(){
        System.out.println("50%");
    }

    class Result{
        public static void main(String[] args) {
            CentralBank 
        }
    }