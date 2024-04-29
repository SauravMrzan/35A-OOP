package Tasks.Week3;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner eo = new Scanner (System.in);
        System.out.println("Enter a num");
        int n = eo.nextInt();
        if (n % 2 == 0){
            System.out.println(n +" is even");
        }else{
            System.out.println(n+" is odd");
        }
        eo.close();
    }
}
