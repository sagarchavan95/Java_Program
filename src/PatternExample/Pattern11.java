package PatternExample;

public class Pattern11 {
    /*
         1 2 3 4 5
         1 2 3 4 5
         1 2 3 4 5
         1 2 3 4 5
     */
    public static void main(String[]args){
        for (int row=1;row<=5;row++){
            for(int column=1;column<=5;column++){
                System.out.print(column);
            }
            System.out.println();
        }
    }

}
