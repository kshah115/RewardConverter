public class RewardValue {

    private final double cashValues;

    public static final double conversion =0.0035;


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

        return (int) (cashValues/conversion) ;



    }

// calculates the
    private static double convertToCash(int milesValue){


        return milesValue*conversion;



    }

    public double getCashValues () {

        return cashValues;
    }



    public double getmilesValue () {


        return convertToMiles(this.cashValues);
    }





}

