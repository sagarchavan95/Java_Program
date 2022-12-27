package PatternExample;

public class Pattern18 {
    /*
                 1
                2 2
               3 3 3
              4 4 4 4
             5 5 5 5 5
     */
   public static void main(String[] args) {
        int numberOfRows=5;
        for (int row = 1; row <=numberOfRows ; row++) {
            for (int space = numberOfRows-row; space>0 ; space--) {
                System.out.print(" ");
            }
            for (int column = 1; column <=row ; column++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}