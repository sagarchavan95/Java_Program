package Loops;

import java.util.Scanner;

public class PrintTable {
    //print table of any number
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(i*number);
        }

    }

}
