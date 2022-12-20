package Inputbyuser;

import java.util.Scanner;

public class Assignment2 {
//Take two integer inputs from user. First calculate the sum of two then product of two.
// Finally print the sum and product of both obtained results
public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int p=scanner.nextInt();
    int q=scanner.nextInt();
    int r=p+q;
    int s=p*q;
    System.out.println("sum :"+r+"  product :"+p);

}
}
