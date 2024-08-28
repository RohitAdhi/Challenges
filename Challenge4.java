
/*Create a Program to add two Numbers */
import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        System.out.println("Welcome to my Addition Section");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Enter Your First Number : ");
        int num1 = sc.nextInt();
        System.out.println(" Please Enter Your Second Number");
        int num2 = sc.nextInt();
        int Addition = num1 + num2;
        System.out.println("Sum Of Your Number is: " + Addition);

    }

}
