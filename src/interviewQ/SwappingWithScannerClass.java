package interviewQ;
import java.util.Scanner;
public class SwappingWithScannerClass {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Two number");
            int x= sc.nextInt();
            int y= sc.nextInt();

            System.out.println("before Swaping  "+x+"  "+y);
            x=x+y;
            y=x-y;
            x=x-y;
            System.out.println("After Swaping  "+ x+"    "+y);
    }
}
