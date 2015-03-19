package myExamples;

import java.util.Scanner;
/**
 * Created by robert.chisholm on 17/03/2015.
 */
public class Calculator {

    public static void main(String[] args) {
//        System.out.println(add(3,3));
//        System.out.println(divide(3,3));
//        System.out.println(multiply(3,3));
//        System.out.println(subtract(3,3));

        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        String result;

        System.out.println("Please Enter Your first number");
        num1 = scnr.nextInt();

        System.out.println("Calculate (+  /  *  -)");
        String operation = scnr.next();

        System.out.println("Please Enter Your second number");
        num2 = scnr.nextInt();

        if (operation.contains("+")){
            result = add(num1, num2).toString();
        }
        else if (operation.contains("/")){
            result = divide(num1, num2).toString();
        }
        else if (operation.contains("*")){
            result = multiply(num1, num2).toString();
        }
        else if (operation.contains("-")){
            result = subtract(num1, num2).toString();
        }
        else {
            result = "Operation not supported (use +  /  *  -)";
        }
        System.out.println(result);

    }
    public static Integer add (int num1, int num2){
        return num1+num2;
    }
    public static Integer divide (int num1, int num2){
        return num1/num2;
    }
    public static Integer multiply (int num1, int num2){
        return num1*num2;
    }
    public static Integer subtract (int num1, int num2){
        return num1-num2;
    }

}
