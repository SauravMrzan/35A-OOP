package Tasks.Week3;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner leap = new Scanner (System.in);
        System.out.println("Enter a year");
        int year = leap.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 && year % 400 == 0)){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
        leap.close();
    }

    
}
