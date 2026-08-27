import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();       // this reads the String first

        System.out.println("Enter your age: ");
        int age = sc.nextInt();            // int is read last, no leftover newline to worry about

        System.out.println("Hello " + name + "! In Five years, you will be " + (age + 5) + " years old.");
        sc.close();
    }
}
