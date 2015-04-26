package ninth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Lee on 25/04/2015.
 */
public class Lottery {

    private int noOfLottoBalls;
    private int noOfBonusBalls;

    public static void main(String[] args) {
        Lottery lottery = new Lottery(6, 2);
        ArrayList<Integer> lottoNumbers = lottery.pickBalls();
        lottery.pickBonusBall(lottoNumbers);
    }

    public int getNoOfBonusBalls() {
        return noOfBonusBalls;
    }

    public Lottery(int NoOfLottoBalls, int NoOfBonusBalls){
        this.noOfLottoBalls = NoOfLottoBalls;
        this.noOfBonusBalls = NoOfBonusBalls;
    }

    public ArrayList pickBalls(){
        ArrayList<Integer> lottoNumbers = new ArrayList<Integer>();
        int nextRandomNumber;

        while(lottoNumbers.size() < noOfLottoBalls){
            Random randomNumber = new Random();
            nextRandomNumber = Math.abs(1 + randomNumber.nextInt() % 48);
            if(!lottoNumbers.contains(nextRandomNumber)) {
                lottoNumbers.add(nextRandomNumber);
            }
        }
        Collections.sort(lottoNumbers);
        for (Integer num : lottoNumbers){
            System.out.print("(" + num + "), ");
        }
        return lottoNumbers;
    }

    public void pickBonusBall(ArrayList<Integer> numbersSelected){
        Random random = new Random();
        ArrayList<Integer> randomBonusBalls = new ArrayList<Integer>();

        while(randomBonusBalls.size() < getNoOfBonusBalls()) {
            int possibleBonusBall = Math.abs(1 + random.nextInt() % 48);
            if (!numbersSelected.contains(possibleBonusBall)) {
                randomBonusBalls.add(possibleBonusBall);
            }
        }
        Collections.sort(randomBonusBalls);
        System.out.print(" Bonus: ");
        for (Integer bonusBall : randomBonusBalls) {
            System.out.print("(" + bonusBall + ")");
        }
    }

}
