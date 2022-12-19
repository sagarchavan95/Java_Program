package Operators;

public class Assignment4 {
    //Now, solve the above question using assignment operators (eg. +=, -=, *=).
    public static void main(String[] args) {
        int number= 10;
        number +=8;
        System.out.println("After Addition "+number);
        number -=8;
        System.out.println("After subtraction "+number);
        number *=10;
        System.out.println("After multiplication "+number);
        number /=10;
        System.out.println("After Division "+number);

        /* 2nd EX
        package operators.arithmetic;
        public class Demo7 {
            public static void main(String[] args) {
                int number = 122;
                number += 8;// this is equal to number = number + 8;
                System.out.println("Addition " + number);//130
                number -= 3; // this is equal to number = number -3;
                System.out.println("substraction " + number);//127

                number /= 3; // this is equal to number = number / 3;
                System.out.println("division " + number);//42

                number *= 3;// this is equal to number = number * 3;
                System.out.println("multiplication " + number);//126
            }
        }*/


    }
}
