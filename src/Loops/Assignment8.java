package Loops;

import java.util.Scanner;

public class Assignment8 {
    //Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <=number/2 ; i++) {
            if(number%i==0){
                System.out.println("factor "+i);
            }
        }
    }
}
