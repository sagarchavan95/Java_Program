package Operators;

public class Assignment16 {
    //Write a program to reverse a 3-digit number. E.g.-Number : 132 Output : 231
    public static void main(String[] args) {
        int n, first, second, third, reverse;
        n=123;
        first=n/100;     //first digit
        n = n%100;

        second=n/100;    //second digit
        third=n%10;      //third digit

        // reverse number
        reverse=third*100 + second*10+first;
        System.out.println("reverse number : "+reverse);

    }
}
