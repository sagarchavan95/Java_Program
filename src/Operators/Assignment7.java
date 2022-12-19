package Operators;

public class Assignment7 {
    //Assign values of variables 'a' and 'b' as 55 and 70 respectively and
    // then check if both the conditions 'a < 50' and 'a < b' are true.
    public static void main(String[] args) {
        int a=55;
        int b=70;
        if (a<50){
            System.out.println("A is less than 50 "+a);
        }
            else if(a<b){
            System.out.println("A is less than B");
        }
        //2nd condition
        //System.out.println(a<50 && a < b );
    }
}
