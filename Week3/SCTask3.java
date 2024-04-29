package Tasks.Week3;
import java.util.Scanner;
public class SCTask3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a num from 1-12");
    int n = sc.nextInt();
    switch (n){
        case 1:
        case 2:
        case 3:
        System.out.println("Winter");
        break;
        case 4:
        case 5:
        case 6:
        System.out.println("Spring");
        break;
        case 7:
        case 8:
        case 9:
        System.out.println("Summer");
        break;
        case 10:
        case 11:
        case 12:
        System.out.println("Fall");
        break;
        default:
        System.out.println("Try again");
    }
    sc.close();
    }
}
