import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9.0 / 5 + 32;    // 9.0 results to floating-point division

        System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");
        sc.close();
    }
}
