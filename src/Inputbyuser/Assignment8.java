package Inputbyuser;

import java.util.Scanner;

public class Assignment8 {
    //Take 3 inputs from user and check all are equal any of two are equal
    //( use && || )
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=scanner.nextInt();
        System.out.println("Enter the second number");
        int b=scanner.nextInt();
        System.out.println("Enter the third number");
        int c=scanner.nextInt();
        System.out.println("All are equal:"+(a==b&&b==c&&c==a));
        System.out.println("Any are two equal:"+(a==b||b==c||c==a));

    }
}
