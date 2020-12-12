package Numbers.FactorialNumbers;

public class Solution_FactorialNumber {

    public static int factorialNumber(int n){

        int result = 1;

        for(int i = 1; i <= n; i++){

            result = result * i;

        }

        return result;

    }


}
