package ArrayList.RemoveAhmed;

import Strings.SameLetters.Solution;

import java.util.*;

public class Solution_RemoveAhmed {
/*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed

 */

   // Solution 1:

    public static void main(String[] args) {



    ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

            names.removeAll( Arrays.asList("Ahmed"));



System.out.println(names);



  //  Solution 2:

    List<String> names2 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

for(
    ListIterator<String> it=names.listIterator(); it.hasNext();)

            if(it.next().equals("Ahmed"))

            it.remove();



System.out.println(names2);

   // Solution 3:

    List<String> names3 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

            List<String> names33 = new ArrayList<>();

    names.forEach(p-> {if(p.equals("Ahmed")) names33.add(p);}  );



System.out.println(names3);



  //  Solution 4:

    List<String> names4 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

            Iterator<String> it = names.iterator();

    while(it.hasNext()) {

        if(it.next().equals("Ahmed"))

            it.remove();

    }

    System.out.println( names4 );


}
}