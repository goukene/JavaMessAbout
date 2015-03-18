package myExamples;

/**
 * Created by robert.chisholm on 17/03/2015.
 */
public class MoneyBox {
    private int total = 0;
    private int overdraft = 100;

    public void deposit(int amount){
        total=total + amount;
    }

    public String withdrawl (int amount){
        if (amount==total){
            return "Tried to withdraw £" + amount + " but you have £" + total;
        }
        if (amount>total+overdraft){
            return "Overdraft limit exceeded, your requested £" + amount+ " " + "your overdraft limit is £" + overdraft;
        }
        total=total - amount;
        return "£" + amount + " - Money withdrawn, your new balance is £" + total;
    }

    public int getTotal() {
        return total;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public static void main (String[] args){
        MoneyBox moneyBox = new MoneyBox();
        moneyBox.getTotal();
        moneyBox.getOverdraft();

        System.out.println("£" + moneyBox.getTotal());
        moneyBox.deposit(5);
        System.out.println("£" + moneyBox.getTotal());
        System.out.println(moneyBox.withdrawl(106));
        System.out.println("£" + moneyBox.getTotal());
        moneyBox.deposit(650);
        System.out.println("£" + moneyBox.getTotal());
        System.out.println(moneyBox.withdrawl(649));
    }

}
