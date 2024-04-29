package Tasks.Week3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a num");
        int n = scan.nextInt();
        if (n == 0){
            System.out.println("The num is zero");
        }else if (n > 0){
            System.out.println("The num is posivite");
        }else{
            System.out.println("The num is negative");
        }
        scan.close();
    }
}
