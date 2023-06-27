
// import libraries to

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardTest {


    @Test
   void createwithcashvalue() {
        double cashValue = 100;
        var rewardValue= new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValues());

    }

    @Test

    void create_with_mile_value() {


        int  milesValue=1000;
        var rewardValue= new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getmilesValue());

    }

    @Test
    void convert_from_cash_to_miles(){


        double cashValue= 100;
        /*
        double miles_to_cash_rate = 0.0035;
        */

        double expectedMilesValue= (int)(cashValue/RewardValue.conversion);
        var rewardValue= new RewardValue(cashValue);

        assertEquals(expectedMilesValue, rewardValue.getmilesValue());



    }

    @Test

    void  convert_from_miles_to_cash(){


        int milesValue= 10000;
        /*
        double miles_to_cash_rate= 0.0035;

         */

        double expectedCashValue=milesValue*RewardValue.conversion;
        var rewardValue= new RewardValue(milesValue);

        assertEquals(expectedCashValue, rewardValue.getCashValues());
    }


















}
