import java.util.Scanner;

public class RectanglePerimeter6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Take a Side of A: ");
            int A = sc.nextInt();
            System.out.println("Take a Side of B: ");
            int B = sc.nextInt();
            System.out.println("Take a Side of C: ");
            int C = sc.nextInt();
            System.out.println("Take a Side of D: ");
            int D = sc.nextInt();
            int Perimeter = A + B + C + D;
            System.out.println("Perimeter of Rectangle is : " + Perimeter);
        }
    }
}
