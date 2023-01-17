package ClassandObject;
//Print the average of three numbers entered by user by creating
// a class named 'Average' having a method to calculate and print the average.
public class Assignment8 {
    int number1;
    int number2;
    int number3;
    int assignVal(int n1,int n2,int n3){
        number1=n1;
        number2=n2;
        number3=n3;
        return number1*number2*number3;
    }
    float getAvg(int a,int b, int c){
        number1=a;
        number2=b;
        number3=c;
        return number1+number2+number3/3;
    }

    public static void main(String[] args) {
        Assignment8 avgOf= new Assignment8();
        int s=avgOf.assignVal(55,45,58);
        System.out.println(s);
        System.out.println("Average of three number is"+avgOf.getAvg(5,5,5));

    }
}

