package Tasks.Week2;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a side");
        int l = sc.nextInt();
        System.out.println("Area=" + (l*l));
        System.out.println("Perimeter=" + (4*l));
        System.out.println("Enter principle");
        int p = sc.nextInt();
        System.out.println("Enter time");
        int t = sc.nextInt();
        System.out.println("Enter rate");
        int r = sc.nextInt();
        System.out.println("Simple Interest " + ((p*t*r)/100));
        System.out.println("Enter height");
        int h = sc.nextInt();
        System.out.println("Enter base");
        int b = sc.nextInt();
        System.out.println("Area=" + ((1/2)*b*h));
        System.out.println("Enter a side for cube");
        int l1 = sc.nextInt();
        System.out.println("Volume=" + (l1*l1*l1));
        System.out.println("Enter length");
        int l2 = sc.nextInt();
        System.out.println("Enter breadth");
        int b2 = sc.nextInt();
        System.out.println("Enter a height");
        int h2 = sc.nextInt();
        System.out.println("Volume=" + (l2*b2*h2));
        sc.close();
        
    }
    
}
