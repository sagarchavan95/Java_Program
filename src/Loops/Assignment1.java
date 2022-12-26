package Loops;

import java.util.Scanner;

public class Assignment1 {
    //Take 10 integers from keyboard using loop and print their average value on the screen.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many numbers you want to calculate");
        int numbers=scanner.nextInt();
        System.out.println("Enter the value");
        float sum=0;
        for (int i=1;i<=numbers;i++);{
        sum+=scanner.nextInt();
        }
        float average=sum/numbers;
        System.out.println("average"+average);
    }
}
