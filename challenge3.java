
/*Create a program to input name of the person
         and respond with " Welcome Name to Rohit's Java Practices"*/
import java.util.Scanner;

public class challenge3 {
    public static void main(String[] args) {
        System.out.print("PleaseEnter Your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome " + name + "  to Rohit's java Practice ");

    }
}
