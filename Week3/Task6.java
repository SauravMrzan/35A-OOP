package Tasks.Week3;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter alphabet: ");
        String alpha = sc.nextLine();
        switch (alpha){
            case "a" :
            case "e" :
            case "i" :
            case "o" :
            case "u" :
            System.out.println("It is a vowel");
        default:
            System.out.println("It is consonant");
        }
        sc.close();
    }
}
