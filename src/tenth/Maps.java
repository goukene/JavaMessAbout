package tenth;

import java.util.*;

public class Maps {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");

        Set<String> set = new HashSet<String>();

        set.add("one");
        set.add("one");
        set.add("one");
        set.add("one");
        set.add("two");
        set.add("two");
        set.add("three");
        set.add("three");
        set.add("three");

        // think of phone directory

        //  key       value
        // PersonA -> 01234
        // PersonB -> 01235
        // PersonC -> 01236
        // PersonD -> 01237
        // PersonE -> 01238

        Map<String, Integer> telephoneDirectory = new HashMap<String, Integer>();
        telephoneDirectory.put("PersonA", 1234);
        telephoneDirectory.put("PersonB", 1235);
        telephoneDirectory.put("PersonC", 1236);

        Integer numberA = telephoneDirectory.get("PersonA");

        Integer numberD = telephoneDirectory.get("PersonD");

        System.out.println(numberD);

//        if (numberD == null) {
//            System.out.println("not found");
//        } else {
//            System.out.println("numberD: " + numberD);
//        }



    }


}
