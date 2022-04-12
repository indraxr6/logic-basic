import java.util.Scanner;

public class evenodd {
          public static void main(String[] args) {

          System.out.println("Enter value");
                    
          Scanner input = new Scanner(System.in);
          int val = input.nextInt();
          input.close();

          if (val % 2 == 0) {
                    System.out.println("Even");
          } else {
                    System.out.println("Odd");
          
          }
          
}
}
