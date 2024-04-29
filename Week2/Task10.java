package Tasks.Week2;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter sub1 marks: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter sub2 marks: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter sub3 marks: ");
        int sub3 = sc.nextInt();
        System.out.print("Enter sub4 marks: ");
        int sub4 = sc.nextInt();
        int per = (sub1 + sub2 + sub3 + sub4)/4 ;
        if (per>=70){
            System.out.println("First Class");
        }else if (per>59){
            System.out.println("Upper Second Class");
        }else if (per>49){
            System.out.println("Second Class");
        }else if (per>39){
            System.out.print("Third Class");
        }else{
            System.out.println("Fail");
        }
        sc.close();


    }
    
}
