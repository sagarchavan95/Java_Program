package Inputbyuser;

import java.util.Scanner;

public class Assignment4 {
//Take name, roll number and field of interest from user and print in the format below :
//Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name");
    String a=sc.next();
    System.out.println("Enter roll number");
    int b=sc.nextInt();
    System.out.println("Enter field of interest");
    //sc.next();
    String c=sc.next();
    System.out.println("Hey my name is "+a+"  My roll number is "+b+"  My field of interest "+c+"");
}
}
