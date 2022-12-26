package Inputbyuser;

import java.util.Scanner;

public class Assignment11 {
    //to find the sum of squares of 2 numbers?
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.print(squareOfSum(number1, number2));
    }
    public static int squareOfSum(int var1 ,int var2){
        int sum = (var1 + var2);
        int squareOfSum = sum*sum;
        return squareOfSum;
    }
}

