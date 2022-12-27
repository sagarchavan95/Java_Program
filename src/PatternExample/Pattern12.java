package PatternExample;

public class Pattern12 {
    /*
          * * * * *
           * * * *
            * * *
             * *
              *
     */
    public static void main(String[]args){
        for (int row=1;row<=5;row++){
            for (int space=0;space<row;space++){
                System.out.print(" ");
            }
            for (int column =5; column>=row ; column--){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
