
import java.util.Arrays;
import java.util.Collections;
 
public class array_maxvalue {
    public static void main(String[] args)
    {
 
        // Initializing array of integers
        Integer[] num = { 2, 4, 7, 5, 9 };
        int min = Collections.min(Arrays.asList(num));
 

        int max = Collections.max(Arrays.asList(num));
 
        // printing minimum and maximum numbers
        System.out.println("Minimum number of array is : "
                           + min);
        System.out.println("Maximum number of array is : "
                           + max);
    }
}



