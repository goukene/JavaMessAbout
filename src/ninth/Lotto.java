package ninth;

import java.util.*;

public class Lotto {

    private Random random = new Random();

    public void printNumbers() {
        Set<Integer> lottoNumbers = generateNumbers();

        for (Integer number : lottoNumbers) {
            System.out.print(number + ", ");
        }

    }

    private Set<Integer> generateNumbers() {
        Set<Integer> numbers = new TreeSet<Integer>();


        while (numbers.size() < 6) {
            int nextRandomNumber = Math.abs(1 + random.nextInt() % 48);

            numbers.add(nextRandomNumber);

        }

        return numbers;
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();

        lotto.printNumbers();


    }
}
