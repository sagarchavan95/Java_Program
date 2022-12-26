package Inputbyuser;

import java.util.Scanner;

public class Assignment5 {
//Take side of a square from user and print area and perimeter of it.
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your side");
    int a=s.nextInt();
    System.out.println("Area :"+(a*a)+"  Perimeter"+(4*a));
}
}
