package ninth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Lee on 25/04/2015.
 */
public class Lottery {

    private int noOfLottoBalls;
    private int noOfBonusBalls;

    public static void main(String[] args) {
        Lottery lottery = new Lottery(6, 2);
        List<Integer> lottoNumbers = lottery.pickBalls();
        List<Integer> bonusBalls = lottery.pickBonusBall(lottoNumbers);
        lottery.pickBonusBall(lottoNumbers);

        lottery.showNumbers(lottoNumbers, bonusBalls);
    }

    public int getNoOfBonusBalls() {
        return noOfBonusBalls;
    }

    public Lottery(int NoOfLottoBalls, int NoOfBonusBalls){
        this.noOfLottoBalls = NoOfLottoBalls;
        this.noOfBonusBalls = NoOfBonusBalls;
    }

    public ArrayList<Integer> pickBalls(){
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

        return lottoNumbers;
    }

    private void showNumbers(List<Integer> lottoNumbers, List<Integer> bonusBalls) {
        for (Integer num : lottoNumbers){
            System.out.print("(" + num + "), ");
        }
        System.out.print(" Bonus: ");
        for (Integer bonusBall : bonusBalls) {
            System.out.print("(" + bonusBall + ")");
        }
    }

    public List<Integer> pickBonusBall(List<Integer> numbersSelected){
        Random random = new Random();
        ArrayList<Integer> randomBonusBalls = new ArrayList<Integer>();

        while(randomBonusBalls.size() < getNoOfBonusBalls()) {
            int possibleBonusBall = Math.abs(1 + random.nextInt() % 48);
            if (!numbersSelected.contains(possibleBonusBall)) {
                randomBonusBalls.add(possibleBonusBall);
            }
        }
        Collections.sort(randomBonusBalls);

        return randomBonusBalls;

    }

}
