package PatternExample;

public class Pattern7 {
    /*
    1
    1 1
    1 1 1
    1 1 1 1
    1 1 1 1 1
     */
    public static void main(String[] args) {
        for (int row  = 1; row  <=5 ; row ++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}
