import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        double length = sc.nextDouble();

        System.out.println("Enter the width: ");
        double width = sc.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);     //parenthesis matters for proper order of operations

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        sc.close();

    }
}
