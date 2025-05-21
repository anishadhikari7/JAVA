import java.util.Scanner;
public class javaProgram{
    public static void main(String[] args) {
        int first, second, sum, difference, product;
        float quotient;
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Enter 2 numbers:");
        first = scanner.nextInt();
        second = scanner.nextInt();
        sum = first + second;
        difference = first - second;
        product = first * second;
        quotient =(float) first / second;
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Multiplication = " + product);
        System.out.println("Division = " + quotient);
    }
}