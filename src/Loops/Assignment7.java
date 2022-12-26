package Loops;

import java.util.Scanner;
//Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n
public class Assignment7 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial =1;

        //for (int i = 1; i >=number ; i--) {
            for (int i = 1; i <=number ; i++){
            factorial = factorial * i;
        }


        System.out.println("Factorial= "+factorial);
    }
}

