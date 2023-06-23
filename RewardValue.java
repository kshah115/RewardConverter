public class RewardValue {



    private  double  cashValues;
    private double  milesValue;





    public RewardValue(double cashValues) {

        this.cashValues=cashValues;

        this.milesValue=cashValues/0.0035;

    }


    public RewardValue( int milesValue, boolean isMiles) {

        this.milesValue = milesValue;
        this.cashValues = milesValue*0.0035;


    }



    public void setCashValues ( double  cashValues) {


        this.cashValues = cashValues;


    }



    public double   getCashValues() {
        return cashValues;

    }





    public double  getmilesValue() {

        return milesValue;
    }







}
