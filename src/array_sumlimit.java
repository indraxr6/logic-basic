import java.util.Scanner; 
import java.util.Arrays;

public class array_sumlimit {
          public static void main(String[] args) {
                    //k = limit 
                    //n = limit size of array indexes
                    //x = array size

                    int k, n, x, arr[], i, a, val;
                    int result = 0;

                    Scanner input = new Scanner(System.in);

                    String output = "False";

                    System.out.println("Enter sum limit");
                    k = input.nextInt();

                    System.out.println("Enter size of array");
                    x = input.nextInt();
                    arr = new int[x];

                    System.out.println("Enter"+x+"array value");
                    for(i=0; i<x; i++) {
                              System.out.println("Enter element "+(i));
                              arr[i]=input.nextInt();
                    }

                    for (i = 0 ; i < x ; i++) {
                              for (a = 0; a < x ; a++) {
                                        if (arr[i] != arr[a]) {
                                                  if (arr[i] + arr[a] == k) {
                                                            result++;
                                                  }   
                                        }
                              }
                    }
                    if (result > 0) {
                              output = "True";
                    }

                    String arrayval = Arrays.toString(arr);
                    System.out.println("\nArray is: "+arrayval);
                    System.out.println("true/false: "+output);

                    if (result < 0 ){
                              System.out.println("No pair found : " +result);
                    }
                    
                    
          }
}


