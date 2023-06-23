

import java.util.Scanner;
public class Main {
    public static   void main(String[] args)  {


        var scanner= new Scanner(System.in);
        System.out.println(" Welcome to Credit Card Reward Converter  ");
        System.out.println(" Please enter cash value to convert to airline miles  ");
        var input_value= scanner.nextLine();
       double  cashValues ;
        try {
            cashValues = Double.parseDouble(input_value);
        }

        catch(NumberFormatException exception ){

            System.out.println(" Could not parse input value as a double , existing ");
            return;
        }

        System.out.println(" converting $"+ input_value+" to miles");
        var rewardValue= new RewardValue(cashValues);

        System.out.println( " $"+input_value+" is worth " + rewardValue.getmilesValue()+ " miles ");


















        System.out.println("Hello world!");
    }
}