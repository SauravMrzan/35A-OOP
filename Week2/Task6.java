package Tasks.Week2;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter num ");
        int a = sc.nextInt(); 
        System.out.println("Enter second num");
        int b = sc.nextInt();
        System.out.println("Sum"+(a + b));
        System.out.println("Product"+ (a * b));
        System.out.println("Divide"+ ((a * b) / (a + b)));
        sc.close();
    }
    
}
