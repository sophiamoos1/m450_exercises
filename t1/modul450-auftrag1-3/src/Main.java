public class Main {
    public static void main(String[] args) {
        boolean testCase = test_calculate_price();
        System.out.println("The testresult was: " + testCase);
    }

    public static double calculatePrice(double baseprice, double specialprice, double extraprice, int extras, double discount) {
        double addon_discount;
        double result;

        if (extras >= 3)
            if (extras >= 5)
                addon_discount = 15;
            else addon_discount = 10;
        else addon_discount = 0;

        if (discount > addon_discount)
            addon_discount = discount;

        result = baseprice/100.0 * (100-discount) + specialprice
                + extraprice/100.0 * (100-addon_discount);

        return result;
    }

    public static boolean test_calculate_price(){
        boolean test_ok = true;
        //values for calculation
        double testBasePrice = 7000;
        double testDiscount = 5;
        double testSpecialPrice = 55;
        double testExtraPrice = 125;
        int testExtras = 3;
        //expected price
        double expectedPrice = 6817.5;

        //test
        double resultPrice = calculatePrice(testBasePrice, testSpecialPrice, testExtraPrice, testExtras, testDiscount);
        if(resultPrice == expectedPrice){
            test_ok = true;
        }else{
            test_ok = false;
        }
        return test_ok;


    }



}