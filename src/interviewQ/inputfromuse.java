package interviewQ;
import java.util.Scanner;

public class inputfromuse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n= sc.nextInt();
        //public void fooBar ( int n){
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FooBar");
            }
            else if (i % 3 == 0)
            {
                System.out.println("Foo");
            }
            else if (i % 5 == 0)
            {
                System.out.println("Bar");
            }
            else
            {
                System.out.println(i);
            }
        }
    }

}
