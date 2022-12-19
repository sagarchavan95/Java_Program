package DataTayps;

import java.util.Scanner;

public class Assignment3 {
    //Write a program to print the product of the numbers 8.2 and 6.
    public static void main(String[] args) {
        /*float number1=8.2f;
        int number2=6;
        float product=number1*number2;
        System.out.println("the product of number1 & number2 is"+product);*/

        //2nd answer with the help of scanner input
        Scanner values =new Scanner(System.in);
        System.out.println("the product of number1 is");
        float number1=values.nextInt();
        System.out.println("the product of number2 is ");
        int number2=values.nextInt();
        float product=number1*number2;
        System.out.println("the product of given number is"+product);



    }
}
