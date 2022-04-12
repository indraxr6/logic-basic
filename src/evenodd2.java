import java.util.Scanner;
import java.util.Arrays;

public class evenodd2 {
          public static void main(String[] args) {
                    int a, size, val[];

                    Scanner input = new Scanner(System.in);
                    System.out.println("Array size");
                    size=input.nextInt();
                    val = new int[size];

                    System.out.println("Enter "+size+" elements");
                    for(a=0;a<size;a++) {
                              System.out.println("Enter element "+(a+1));
                              val[a]=input.nextInt();
                    }

                    String arr = Arrays.toString(val);
                    System.out.println("\nArray is: "+arr);

                    System.out.println("even numbers are: ");
                    for (a=0;a<size;a++) {
                              if (val[a]%2==0) {
                                        System.out.println(val[a]+" is even");
                              }
                    }
                    System.out.println("\nodd numbers are: ");
                    for (a=0;a<size;a++) {
                              if (val[a]%2!=0) {
                                        System.out.println(val[a]+" is odd");
                              }
                    }
                    System.out.println ("");
                    input.close();
          }
}
