package PatternExample;

public class Pattern17 {
    /*
                    1
                   1 2
                  1 2 3
                 1 2 3 4
                1 2 3 4 5
                 4 3 2 1
                  4 3 2
                   4 3
                    4
     */
    public static void main(String[] args) {
        int k=5;
        for (int row=1;row<=5;row++){
            for (int space=k-row;space>0;space--){
                System.out.print(" ");
            }
            for (int column=1;column<=row;column++){
                System.out.print(column+" ");
            }
            System.out.println();
        }
        for (int row =1;row<=4;row++){
            for (int space=0;space<row;space++){
                System.out.print(" ");
            }
            for (int j = 4; j >=row ; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

