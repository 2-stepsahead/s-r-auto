public class Autoscalper {
    double checkSupport1;
    double checkSupport2;
    double checkSupport3;
    double confirmSupports;
    double checkResistance1;
    double checkResistance2;
    double checkResistance3;
    double confirmResistances;
    double potentialPips;

    //constructor
    public Autoscalper(double support1, double support2, double support3,double confirmSupports,
                       double resistance1, double resistance2, double resistance3, double confirmResistances,
                       double potentialPips) {
        support1 = checkSupport1;
        support2 = checkSupport2;
        support3 = checkSupport3;
        confirmSupports = confirmSupports;
        resistance1 = checkResistance1;
        resistance2 = checkResistance2;
        resistance3 = checkResistance3;
        confirmResistances = confirmResistances;
        potentialPips = potentialPips;
    }

    ////Below checks if the support zones are within between 10% and 20% of each other
    public static double checkSupport1() {
        double supportValue1 = 3;
        //3 is a placeholder for x, which is the CURRENT PRICE
        return supportValue1;
    }

    public static double checkSupport2() {
        double supportValue2 = 3.5;
        //3.5 placeholder for NEXT CURRENT PRICE CHECK
        if (boolean supportValue2 >10 % double supportValue1, double supportValue2 <20 % double supportValue1){
            return true;
        }
    }

    public static double checkSupport3() {
        double supportValue3 = 4;
        //4 placeholder for NEXT CURRENT PRICE CHECK
        if (boolean supportValue3 >10 % double supportValue2, double supportValue3 <20 % double supportValue2){
            return true;
        }
    }

    public static double confirmSupports() {
       if (boolean supportValue3 > 10% double supportValue2, double supportValue3 < 20% double supportValue3){
           return true;
        }
    }

    //Below checks if the resistance zones are within between 10% and 20% of each other
    public static double checkResistance1() {
        double resistanceValue1 = 3;
        //3 is a placeholder for x, which is the CURRENT PRICE
    }

    public static double checkResistance2() {
        double resistanceValue2 = 3.5;
        //3.5 placeholder for NEXT CURRENT PRICE CHECK
        if (boolean resistanceValue2 >10 % double resistanceValue1, double resistanceValue2 <20 % double resistanceValue1){
            return true;
        }
    }

    public static double checkResistance3() {
        double resistanceValue3 = 4;
        //4 placeholder for NEXT CURRENT PRICE CHECK
        if (boolean resistanceValue3 >10 % double resistanceValue2, double resistanceValue3 <20 % double resistanceValue2){
            return true;
        }
    }

    public static double confirmResistances() {
        if (boolean supportResistance3 > 10% double supportResistance2, double supportResistance3 < 20% double resistanceValue3){
            return true;
        }
    }

    //Below ensures the trade will have a favorable profit potential
    public static double checkProfitPotential()

    public static void main(String[] args) {
        if (double confirmSupport && double confirmResistance = true){
            System.out.println("Order submitted");
        } else {
            System.out.println("Order denied");
        }
    }
}
