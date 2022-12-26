package Ifelse;

import java.util.Scanner;

public class Assignment2 {
    //Take two int values from user and print greatest among them.
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the two number");
        num1= scanner.nextInt();
        num2= scanner.nextInt();
        if (num1>num2){
            System.out.println("The First Number Is Greater Than The Second Number");
        }
              else if (num2>num1)
              {
                  System.out.println("The Second Number Is Greater Than The First Number");
        }
              else
              {
                            System.out.println("Both are Equal.");
              }
        }

    }

