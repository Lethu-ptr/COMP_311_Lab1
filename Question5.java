import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Sum: " + (num1 + num2));    //sum
        System.out.println("Difference: " + (num1 - num2));  //diference
        System.out.println("Product: " + (num1 * num2));     //product
        System.out.println("Quotient: " + (num1 / num2));    //quotient
        System.out.println("Remainder: " + (num1 % num2));   //remainder
        sc.close();

    }
}
