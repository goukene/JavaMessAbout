package third;

public class First {

    public static void main(String[] args) throws InterruptedException {
//   Basics of initialisation...
        String greeting;

        greeting = "hello";


        greeting = "bye";

        int x = 10;

        System.out.println(x);


        x = x + 1;


        x = x + 100;
        int y = x;

    //Basics of computer decision making
//        x = 0;

        boolean b = (x == 111 && y == 111);  //and logic statement, if (x == 111) false, then (y == 111) Will not be evaluated.

        boolean pq = false;

        if (!pq) {  // not false is true
            System.out.println("This will print");
        }

        if (b) {
            System.out.println(greeting);
            System.out.println("one time");
        } else if (x == 0) {
            System.out.println("zero");
        }  else {
            System.out.println("something else");
        }

        boolean bb = (x > 0 || y == 1);  //or statement - if x true, then (y == 1) statement will NOT be evaluated
        System.out.println(bb);

        if (bb) {
            System.out.println("hurray");
        }

        System.out.println(b);

        String p = null;

        if (p != null) {

            int h = 0;
            p.length();

            h = 100;
        }


        p = "something";

        if (p != null) {
            System.out.println(p.length());
        }

        //Basics of iteration
        //for loop

        System.out.println("before for loop ");

        // for (initialisation step; loop condition check, post loop operation - usually counter increment) {}

        for (int index = 0; index < 10; index = index + 2) {  //could use index++ here too, same effect
            System.out.println("index = " + index);
        }

        System.out.println("after for loop");

        //while loop

        int w = 0;
        while(w < 10) {
            System.out.println("while - w = " + w);
            w++;  //to forget this step, loop runs forever...
        }

        System.out.println("after while loop");

//timings diversion
        long startTime = System.currentTimeMillis();
        Thread.sleep(1000);
        long endTime = System.currentTimeMillis();

        long shouldBeOneSecondMillis = endTime - startTime;
        double oneSecond = shouldBeOneSecondMillis / 1000.0;

        System.out.println(shouldBeOneSecondMillis);
        System.out.println(oneSecond);

        long beforeWhileLoop = System.currentTimeMillis();  //time before while loop

//run loop while for about 2 seconds
        while(true) {
            Thread.sleep(50);

            System.out.print(".");

            long currentTime = System.currentTimeMillis();

            if (currentTime - beforeWhileLoop > 2000) { //2 seconds
                break;  //breaks out of loop => loop is finished.
            }
            System.out.print("_");
        }
        System.out.println();
        System.out.println("After break, breaks outta loop, comes here.");
    }  //end main method

} // end class First
