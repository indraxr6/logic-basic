import java.util.Scanner;

public class valuedecrement3 {
          public static void main(String[] args) {
          
                    int val;
                    int a=0;
                    int sum=0;
                    int i=a;

          Scanner input = new Scanner(System.in);
          System.out.println("Enter value");
          val = input.nextInt();
          input.close();

          while(i<=val) {
                    sum = sum + i;
                    i++;
          }
          System.out.println("" +sum);
          }
          

          
}
