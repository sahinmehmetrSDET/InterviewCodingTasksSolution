package Strings.Revrse;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Solution_1 {

    //Write a return method that can reverse  String
    //
    //Ex: Reverse("ABCD"); ==> DCBA



        public static String StrReverse(String str) {

            String reverse="";

            for(int i=str.length()-1; i >= 0; i--)

                reverse += str.toCharArray()[i];



            return  reverse;

        }



    }



