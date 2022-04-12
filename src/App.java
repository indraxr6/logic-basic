import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int num1, num2, num3, greatest;
        Scanner input = new Scanner(System.in);

        System.out.println("Minimal and maximal values of three numbers: ");
        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        System.out.print("Enter third number: ");
        num3 = input.nextInt();

        if(num1 > num2 && num1 > num3) {
            greatest = num1;
        } else if(num2 > num1 && num2 > num3) {
            greatest = num2;
        } else {
            greatest = num3;
            input.close();
        }
        
        System.out.println("The greatest number is: " + greatest);
    }
    
   
}



