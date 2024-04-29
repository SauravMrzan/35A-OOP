package Tasks.Week3;
import java.util.Scanner;
public class SCTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a grade");
        String grade = sc.nextLine();
        grade = grade.toUpperCase();
        switch (grade){
            case "A":
            System.out.println("4");
            break;
            case "B":
            System.out.println("3.2");
            break;
            case "C":
            System.out.println("2.8");
            break;
            case "D":
            System.out.println("2.4");
            break;
            case "E":
            System.out.println("1.8");
            break;
            case "F":
            System.out.println("fail");
            break;
            default:
            System.out.println("Type again");
            break;
        }
        sc.close();
    }
}
