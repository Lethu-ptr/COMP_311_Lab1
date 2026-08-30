import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three scores: ");
        double score_1 = sc.nextDouble();
        double score_2 = sc.nextDouble();
        double score_3 = sc.nextDouble();      //all three read from one line, space-separated

        double average = (score_1 + score_2 + score_3) / 3;
        System.out.println("Average: " + average);
        sc.close();
        
    }
}
