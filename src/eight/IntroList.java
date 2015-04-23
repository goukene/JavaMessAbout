package eight;

import ninth.Bucket;
import ninth.QuantityOfWater;

import java.util.ArrayList;
import java.util.List;

public class IntroList {

    public static void main(String[] args) {

 //     interface                     concrete type
        List<String> stringList = new ArrayList<String>();

        //List -> most useful data structure provided by JDK

        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");
        stringList.add("five");

        for (String s : stringList) {
            System.out.println(s);
        }

        System.out.println("-------------");

        List<String> anotherList = new ArrayList<String>(stringList);

        anotherList.add("six");

        for (String s : anotherList) {
            System.out.println(s);
        }

        //HW: experiment, convert arrays to lists in your code


        System.out.println("-------GET------");
        //get

        String fourthElement = stringList.get(3);
        System.out.println(fourthElement);

        System.out.println("Size of anotherList: " + anotherList.size());

        if (anotherList.contains("five")) {
            System.out.println("yes 5");
        } else {
            System.out.println("No 5");
        }

        if (anotherList.contains("ten")) {
            System.out.println("yes 10");
        } else {
            System.out.println("No 10");
        }

//        String s = anotherList.get(100);
        long times = 0;

//run below to exhaust memory
//
//        while(true) {
//            if (times % 100000 == 0) {
//                System.out.println(times);
//            }
//            anotherList.add("hello");
//            ++times;
//        }


        List<Bucket> buckets = new ArrayList<Bucket>();
        buckets.add(new Bucket(200));
        buckets.add(new Bucket(30));
        buckets.add(new Bucket(100));
        buckets.add(new Bucket(5));

        QuantityOfWater water = new QuantityOfWater(30);

        buckets.get(0).addWater(water);
        buckets.get(1).addWater(water);
        buckets.get(2).addWater(water);
        buckets.get(3).addWater(water);



    }

}
