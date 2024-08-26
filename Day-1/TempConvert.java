import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Temperature");
        Float fah = sc.nextFloat();
        float cel = (fah - 32) * 5.0f / 9.0f;
        System.out.println("Your Temperature  is " + cel + "c");
    }

}
