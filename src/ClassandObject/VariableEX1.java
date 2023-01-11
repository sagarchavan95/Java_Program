package ClassandObject;

public class VariableEX1 {
    int number1=100;
    int number2=200;
    static int number3=300;
    static int number4=400;
    public static void main(String[] args) {
        VariableEX1 sc=new VariableEX1();
        //for access static variable
        System.out.println(VariableEX1.number3+VariableEX1.number4);
        System.out.println(sc.number1+sc.number2);
        System.out.println(sc.number1+VariableEX1.number4);

    }
}
