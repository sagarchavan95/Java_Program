package Operators;

public class Assignment13 {
    //Write a program to calculate the sum of the first and the second last digit of a 5 digit.
    //E.g.- NUMBER : 12345        OUTPUT : 1+4=5
    public static void main(String[] args) {
        int number=12345;
        int lastDigit=number%10;
        number/=10;
        int secondLastDigit=number%10;
        System.out.println("last digit"+lastDigit);
        System.out.println("second last digit"+secondLastDigit);
        System.out.println("sum of the first and second digit"+(lastDigit+secondLastDigit));

    }
}
