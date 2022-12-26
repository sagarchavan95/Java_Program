package PatternExample;

public class pattern8 {
    /*
           *
          **
         ***
        ****
       *****
     */
    public static void main(String[] args) {
        int numberOfRows = 5;
        for (int row = 1; row <=numberOfRows; row++) {
            for (int space = numberOfRows-row; space>0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= row; star++) {
                System.out.print("***");
            }
            System.out.println();
        }
    }
}
