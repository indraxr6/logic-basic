import java.util.Scanner;
import java.util.Arrays;

public class data_highestvalue {

    
    public static void main(String[] args) {
        int i, x,  total[], max;
        String fruit[], fruitMax = null;

        Scanner scan = new Scanner(System.in);

        System.out.print("Number of fruit : " );
        x = scan.nextInt();
        fruit = new String[x];
        total = new int[x];

        System.out.println("\nEnter" + x + " fruit limit");
        for (i = 0; i < x; i++) {
            System.out.print("Buah[" + (i) + "] : ");
            fruit[i] = scan.next();
            
            System.out.print("total : ");
            total[i] = scan.nextInt();
            
            System.out.println("");
        }
        
        System.out.println("Added fruit:");
        
        max = total[0];
        fruitMax = fruit[0];
        for(i = 0; i < x; i++){
            System.out.print(fruit[i] +  " = " + total[i] + "\n");
            if(total[i] > max){
                fruitMax = fruit[i];
            }
        }
        
        System.out.println("\nmost fruit = " +  fruitMax);


        
    }
    
}