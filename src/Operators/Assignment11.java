package Operators;

import java.util.Scanner;

public class Assignment11 {
    //Write a program to convert Fahrenheit into Celsius.
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit");
        float Fahrenheit= temp.nextByte();
        float celsius;
        celsius=((Fahrenheit-30)*5)/9;
        System.out.println(+celsius);
        
        System.out.println("hii");
    }
}
