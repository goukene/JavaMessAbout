package ninth;

import java.util.HashSet;
import java.util.Set;

public class IntroSets {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(2);

        for (Integer integer : set) {
            System.out.println(integer);
        }

        System.out.println("size: " + set.size());

       if (set.contains(1)) {
           System.out.println("yes, 1 in set");
       }

       if (!set.contains(100)) {
           System.out.println("100 not in set");
       }

        //remove element 2
        set.remove(2);


        for (Integer integer : set) {
            System.out.println(integer);
        }

        set.clear();
        System.out.println("Size: " + set.size());
    }

}
