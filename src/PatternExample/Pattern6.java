package PatternExample;

public class Pattern6 {
    /*
    1
    2 3
    4 5 6
    7 8 9 10
     */
    public static void main(String[] args) {
        int k=1;
        for (int row = 1; row <=4 ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(k++ +" ");

            }
            System.out.println();
        }

    }
}
