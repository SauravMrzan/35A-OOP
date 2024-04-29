package Tasks.Week2;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a length= ");
        double l = sc.nextDouble();
        System.out.println("Enter a breadth=");
        double b = sc.nextDouble();
        double areaDouble = l*b;
        int areaInt = (int) areaDouble;
        System.out.println("Area in int=" + areaInt);
        sc.close();

    }
    
}
