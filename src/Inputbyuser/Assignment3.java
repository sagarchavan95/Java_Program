package Inputbyuser;

import java.util.Scanner;

//Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
public class Assignment3 {
    public static void main(String[] args) {
        System.out.println("Enter Two no");
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=x*y;
        System.out.println("Double :"+z);
        System.out.println((int)z);
        System.out.println("long value"+(long)z);

    }
}
