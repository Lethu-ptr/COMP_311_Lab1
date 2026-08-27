import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a whole number: ");
        int wholeNumber = sc.nextInt();

        System.out.println("Enter a decimal number: ");
        double decimalNumber = sc.nextDouble();

        System.out.println("Enter a single word: ");
        String word = sc.next();         //next() stops at whitespace, unlike nextLine()

        System.out.println("You entered " + wholeNumber + ", " + decimalNumber + ", and the word \"" + word + "\".");
        sc.close();

    }
}
