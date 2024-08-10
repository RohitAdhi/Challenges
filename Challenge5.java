/*Create a Program to Swap two Numbers */
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Swapping...");
        System.out.println(" Enter Value Of A: ");
        int a= sc.nextInt();
        System.out.println("Enter the Value Pf B:");
        int b= sc.nextInt();

        int c=a;  a=b; b=c;
        System.out.println("Value of A is: "+a);
        System.out.println("Value of B is: "+b);




        
    }
}
