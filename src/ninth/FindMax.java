package ninth;

public class FindMax {

    public static void main(String[] args) {
        int [] numbers = {5,3,1,6,10,3,2};

        int maxNumber = findMax(numbers);

        if (maxNumber == 10) {
            System.out.println("correct");
        } else {
            System.out.println("Try again");
        }
    }

    //homework
    //find max

    public static int findMax(int [] array) {
        //implement me
        return -1;
    }

    /*
       max = -1

       for x in array
          if x > max
             max = x
          endif
       endfor

       return max
     */

}
