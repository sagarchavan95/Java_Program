package ClassandObject;

import java.util.Scanner;

public class AssignmentNO1 {
    //1. Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
    //2. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle.
    //3. Length and breadth of rectangle are entered through keyboard.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        AssignmentNO1 areaOfRectangle=new AssignmentNO1();

        System.out.println("Enter the length :");
        double length=scanner.nextDouble();

        System.out.println("Enter the breadth :");
        double breadth= scanner.nextDouble();
        areaOfRectangle.setDim(length,breadth);
    }
    public void setDim(double length, double breadth){getArea(length,breadth);}
    public void getArea(double length,double breadth){
        double area=length*breadth;
        System.out.println("Area of Rectangle is:"+area);
    }

}
