package Operators;

import java.util.Scanner;

public class Assignment10 {
    //Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively,
    // write two programs to swap the values of the two variables.
    //1 - first program by using a third variable
    //2 - second program without using any third variable
    //( Swapping means interchanging the values of the two variables
    // E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)
    public static void main(String[] args) {
        Scanner values=new Scanner(System.in);
        System.out.println("Enter first number");
        int value1=values.nextInt();
        System.out.println("Enter the Second number");
        int value2=values.nextInt();
        int value3;
        value3=value1;
        value1=value2;
        value2=value3;
        System.out.println(value1+ ""+value2 );


    }
}
