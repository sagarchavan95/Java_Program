package PatternExample;

public class Pattern19 {
    public static void main(String[] args) {
        for (int row = 1; row<=5; row++) {
            for (int space =0; space<row ; space++) {
                System.out.print(" ");
            }
            for (int column =5; column>=row ; column--) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }

}
