import java.util.Scanner;

public class ProductFloatNum7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Take First Float Number ; ");
            float num1 = sc.nextFloat();
            System.out.println("Take the Second Float Number: ");
            float num2 = sc.nextFloat();
            float Product = num1 * num2;
            System.out.println("Product of Two Float Point is: " + Product);
        }
    }
}
