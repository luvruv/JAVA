import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("score");
        int marks = input.nextInt();
        String category = marks > 80 ? "high" : (marks > 50 ? "Moderate" : "low");
        System.out.println("absolute value is: " + category);
    }
}