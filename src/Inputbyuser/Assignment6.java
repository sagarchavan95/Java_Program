package Inputbyuser;

import java.util.Scanner;

public class Assignment6 {
    //Write a program to find square of a number.
    //E.g.-
    //INPUT : 2        OUTPUT : 4
    //INPUT : 5        OUTPUT : 25
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.println("The square of number" + (x*y));

    }
}
