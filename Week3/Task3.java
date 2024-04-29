package Tasks.Week3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner div = new Scanner (System.in);
        System.out.println("Enter a num");
        int n = div.nextInt();
        if (n % 5 == 0 && n % 11 == 0){
            System.out.println(n+" is divisible by 5 and 11");
        }else{
            System.out.println(n+" is not divisible by 5 and 11");
        }
        div.close();
        

    }
}
