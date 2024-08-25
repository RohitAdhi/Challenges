import java.util.Scanner;

public class Operators9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(" Take First Number :");
            int num1 = sc.nextInt();
            System.out.println("Take Second Number ; ");
            int num2 = sc.nextInt();
            int sum = num2 + num2;
            int subs = num1 - num2;
            int multi = num1 * num2;
            int div = num1 / num2;
            int mod = num1 % num2;

            System.out.println("Sum  is :" + sum);
            System.out.println("subtraction is :" + subs);
            System.out.println("Multiplication is :" + multi);
            System.out.println("Division is :" + div);
            System.out.println("Modulo is :" + mod);
        }

    }
}
