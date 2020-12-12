package Arrays.Find_Maximum;

import java.util.Arrays;

import Strings.SameLetters.Solution;

public class Solutions_FindMaximum {

   // Write a method that can find the maximum number from an int Array



  /*  Solution 1:

    public static int maxValue( int[]  n ) {

        int max = Integer.MIN_VALUE;

        for(int each: n)

            if(each > max)

                max = each;



        return max;

    }

   */



   // Solution 2:

    public static int maxValue( int[]  n ) {

        Arrays.sort( n );

        return  n [ n.length-1 ];

    }



}
