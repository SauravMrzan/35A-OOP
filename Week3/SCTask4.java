package Tasks.Week3;
import java.util.Scanner;
public class SCTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a shape");
        String shape = sc.nextLine();
        switch (shape){
            case "circle":
            Scanner cir = new Scanner (System.in);
            System.out.println("Enter radius");
            int r = cir.nextInt();
            System.out.println("Area of circle" + (2*3.17*(r*r)));
            break;
            case "rectangle":
            Scanner rec = new Scanner (System.in);
            System.out.println("Enter length");
            System.out.println("Enter breadth");
            int l = rec.nextInt();
            int b = rec.nextInt();
            System.out.println("Area of rectangle"+ (l*b));
            break;
            case "square":
            Scanner sq = new Scanner (System.in);
            System.out.println("Enter length");
            int a = sq.nextInt();
            System.out.println("Area of square" + (a*a) );
            break;
            case "triangle":
            Scanner tri = new Scanner (System.in);
            System.out.println("Enter base");
            System.out.println("Enter height");
            int p = tri.nextInt();
            int h = tri.nextInt();
            System.out.println("Area of traingle" + ((1/2)* p * h));
            break;
            default:
            System.out.println("Type circle, rectangle, square or triangle");
            break;
        }
        sc.close();
    }
}
