package ClassandObject;
//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively
// by creating a class named 'Rectangle' with a method named 'Area'
// which returns the area and length and breadth passed as parameters to its constructor.
public class Assignment6 {
    int length;
    int breadth;
    public Assignment6(int a, int b){
        length = a;
        breadth = b;
    }
    public int getArea(){
        return length*breadth;
    }
    public int getPerimeter(){
        return 2*(length+breadth);
    }
    public static void main(String[] args){
        Assignment6 a = new Assignment6(4,5);
        Assignment6 b = new Assignment6(5,8);
        System.out.println("Area : "+a.getArea()+" Perimeter is "+a.getPerimeter());
        System.out.println("Area : "+b.getArea()+" Perimeter is "+b.getPerimeter());
    }
}
