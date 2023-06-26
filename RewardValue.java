public class RewardValue {

    private final double cashValues;
    /*
    public static final double convert_cash_to_miles= 0.0035;

*/
// Takes the value in cash
    public RewardValue(double cashValues ){

        this.cashValues= cashValues;
    }

    // converts miles to cash
    public RewardValue(int milesValue) {

        this.cashValues=convertToCash(milesValue);
    }

// calculates the amount of cashValues  that the user input into miles
    private static int convertToMiles(double cashValues ){

        return (int) (cashValues/0.0035) ;



    }

// calculates the conversion from mile to cash
    private static double convertToCash(int milesValue){


        return milesValue*0.0035;



    }

    public double getCashValues () {

        return cashValues;
    }



    public double getmilesValue () {


        return convertToMiles(this.cashValues);
    }





}

