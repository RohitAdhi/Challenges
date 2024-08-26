import java.util.Scanner;

public class GreatestOfAllNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter your Second Number");
        int num2 = sc.nextInt();
        System.out.println("Enter your Third Number");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.print(num1 + " is Your Number Greatest Number");
        } else if (num2 >= num3) {
            System.out.print(num2 + " is Your Num2  Greatest  Number ");
        } else {
            System.out.print(num3 + " is your Num3 is Greatest  Number");
        }
    }
}
