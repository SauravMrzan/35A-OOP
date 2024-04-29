package Tasks.Week2;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter roll number");
        String roll = sc.nextLine();
        System.out.println("Enter area of interest");
        String interest = sc.nextLine();
        System.out.println("Hey, My name is " + name + "and my roll number is " + roll + ". My field of interest are " + interest + ".");
        sc.close();
    }
    
}
