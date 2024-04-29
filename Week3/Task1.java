package Tasks.Week3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a num");
        int n1 = scan.nextInt();
        System.out.println("Enter a sec num");
        int n2 = scan.nextInt();
        System.out.println("Enter a third num");
        int n3 = scan.nextInt();
        if (n1>n2 && n1>n3){
            System.out.println("The max num is"+n1);
        }else if (n2>n3 && n2>n1){
            System.out.println("The max num is"+n2);
        }else{
            System.out.println("The max num is "+n3);
        }
        scan.close();


    } 
}
