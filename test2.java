//even and odd number printing 
package deepak;

public class test2 {
     public static void main(String[] args) {
          System.out.println("even no are :\n");
          // printing even number
          for (int i = 0; i < 50; i++) {
               if (i % 2 == 0) {
                    System.out.println(i);
               }
          }
          System.out.println("odd numbers are \n");
          for (int j = 0; j < 50; j++) {
               if (j % 2 != 0) {
                    System.out.println(j);
               }
          }
     }

}
