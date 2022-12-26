package Ifelse;

import java.util.Scanner;

public class Assignment1 {
    //Take values of length and breadth of a rectangle from user and check if it is square or not
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length");
        int x = scanner.nextInt();
        System.out.println("Enter breadth");
        int y = scanner.nextInt();
        if (x==y) {
        System.out.println("Square");
    }
    else{
            System.out.println("Reactangle");
        }
    }
}
