import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("a=25");
        int num1 = sc.nextInt();

        System.out.print("b=10 ");
        int num2 = sc.nextInt();

        // Multiply
        int product = num1 * num2;

        // Output result
        System.out.println("The product is: " + product);

        sc.close();
    }
}