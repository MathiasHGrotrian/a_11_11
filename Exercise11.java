
package Chapter11;

import java.util.HashSet;
import java.util.Set;

public class Exercise11
{
    /*
    Write a method called symmetricSetDifference that accepts two Sets as parameters and returns a new Set containing
    their symmetric set difference (that is, the set of elements contained in either of the two sets but not in both). For
    example, the symmetric difference between the sets [1, 4, 7, 9] and [2, 4, 5, 6, 7] is [1, 2, 5, 6, 9].
     */

    public static void main(String[] args)
    {
        Set<Integer> set1 = new HashSet<>();

        set1.add(1);
        set1.add(4);
        set1.add(7);
        set1.add(9);

        Set<Integer> set2 = new HashSet<>();

        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        System.out.println(symmetricSetDifference(set1, set2));
    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2)
    {
        Set<Integer> finalSet = new HashSet<>();    //  create set to fill when done

        Set<Integer> difference1 = new HashSet<>(set1);     //  two temporary sets to find differences
        Set<Integer> difference2 = new HashSet<>(set2);

        difference1.removeAll(set2);    //  remove the numbers they both have in common
        difference2.removeAll(set1);

        finalSet.addAll(difference1);   //  add the values to the final set
        finalSet.addAll(difference2);

        return finalSet;
    }

}
