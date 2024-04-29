package Tasks.Week3;
import java.util.Scanner;
public class SCTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an operator");
        String o = sc.nextLine();
        System.out.println("Enter a num");
        int a = sc.nextInt();
        System.out.println("Enter another num");
        int b = sc.nextInt();
        switch (o){
            case "+":
            System.out.println(a + b);
            break;
            case "-":
            System.out.println(a - b);
            break;
            case "*":
            System.out.println(a * b);
            break;
            case "/":
            System.out.println(a / b);
            break;
            default:
            System.out.println("Try again");
        }
        sc.close();
    }
    

}
