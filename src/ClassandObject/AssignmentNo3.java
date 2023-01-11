package ClassandObject;

public class AssignmentNo3 {
    //Assign and print the roll number, phone number and address of two students having names "Sam" and "John"
    // respectively by creating two objects of class 'Student'.
    String name,name2;
    int rollNo,rollNo2;
    long Phone,Phone2;
    String address,address2;

    public static void main(String[] args) {
        //Sagar
        AssignmentNo3 student=new AssignmentNo3();
        student.name="Sagar";
        student.rollNo=10;
        student.Phone=9518763725l;
        student.address="Pune";
        System.out.println("Name "+student.name+"\nroll no of sagar is "+student.rollNo+
                "\nPhone of Sagar is "+student.Phone+
                "\nAddress of Sagar is "+student.address);


        //Harsh
        AssignmentNo3 student2=new AssignmentNo3();
        student2.name2="Harsh";
        student2.rollNo2=22;
        student2.Phone2=98227457415l;
        student2.address2="Georai";
        System.out.println("Name "+student2.name2+"\nroll no of Harsh is "+student2.rollNo2+
                "\nPhone of Harsh is "+student2.Phone2+
                "\nAddress of Harsh is "+student2.address2);



    }


}
