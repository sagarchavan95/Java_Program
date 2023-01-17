package ClassandObject;

public class AssignmentNo4 {
    //Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
    // by creating a class named 'Triangle' without any parameter in its constructor.
    int side1;
    int side2;
    int side3;
    public double getArea() {
        double s =(side1+side2+side3)/2.0;
        return Math.pow((s*(s-side1)*(s-side2)*(s-side3)),.5);
    }
    public double gerPerimeter(){
        return (side1+side2+side3)/2.0;
    }

    public static void main(String[] args) {
        AssignmentNo4 side=new AssignmentNo4();
        side.side1=3;
        side.side2=4;
        side.side3=5;
        System.out.println("Area of triangle is "+side.getArea());
        System.out.println("Perimeter of triangle is "+side.gerPerimeter());
    }
}

