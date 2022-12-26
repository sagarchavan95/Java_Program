package PatternExample;

public class Pattern5 {
     /*
          20 40 60 80 100 120 140 160 180 200
          21 42 63 84 105 126 147 168 189 210
      */
     public static void main(String[] args) {
        // int startRange=20;
         //int endRange=40;
         for (int i =1;i<=10;i++) {
             for (int j = 1; j <=10 ; j++) {
                 System.out.print(j*i+"\t");
             }
             System.out.println();
         }

     }
}
