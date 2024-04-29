package Tasks.Week2;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a num");
        int a = sc.nextInt();
        System.out.println("Enter next num");
        int b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
        System.out.println("Product = " + (a * b));
        sc.close();
    }
}
