package Operators;

public class Assignment16 {
    //Write a program to reverse a 3-digit number. E.g.-Number : 132 Output : 231
    public static void main(String[] args) {
        int number, first, second, third, reverse;
        number=132;
        first=number/100;     //first digit
        number= number%100;

        second=number/100;    //second digit
        third=number%10;      //third digit

        // reverse number
        reverse=third*100 + second*10+first;
        System.out.println("reverse number : "+reverse);

    }
}
