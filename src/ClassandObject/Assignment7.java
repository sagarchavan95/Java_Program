package ClassandObject;
//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of
// its length and breadth as parameters of its constructor and having a method named 'returnArea'
// which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
import java.awt.geom.Area;
import java.util.Scanner;
public class Assignment7 {
    int length;
    int breadth;
    public Assignment7 (int a,int b){
        length=a;
        breadth=b;
    }
    public int getArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.println("Enter length");
        a=scanner.nextInt();
        System.out.println("Enter the Breadth");
        b=scanner.nextInt();
        Assignment7 assignment7=new Assignment7(a,b);
        System.out.println("Area:"+assignment7.getArea());

    }
}
