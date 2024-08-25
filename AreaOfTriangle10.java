import java.util.Scanner;

public class AreaOfTriangle10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Take The Base of a Triangle : ");
            float base = sc.nextFloat();
            System.out.println("Take a Height of the Triangle : ");
            float height = sc.nextInt();
            float AreaOfTriangle = (float) 1 / 2 * base * height;
            System.out.println(" Area of the Triangle is : " + AreaOfTriangle);
        }
    }
}
