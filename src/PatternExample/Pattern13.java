package PatternExample;

public class Pattern13 {
    /*
         5 5 5 5 5
          4 4 4 4
           3 3 3
            2 2
             1
     */
    public static void main(String[]args){
        for (int row=1;row<=5;row++){
            for (int space=0;space<row;space++){
                System.out.print(" ");
            }
            for (int column=5;column>=row;column--){
                System.out.print(6 - row + " ");
            }
            System.out.println();

        }
    }
}
