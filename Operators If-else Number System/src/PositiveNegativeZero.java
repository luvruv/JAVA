import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checl\n");
        System.out.println("Please enter a number: ");
        int a = input.nextInt();
        if (a > 0) {
            System.out.println("Positive");
        } else if (a == 0) {
            System.out.println("Zerp");
        } else {
            System.out.println("Negative");
        }
        System.out.println("please enter a number");
        int b = input.nextInt();
        if (b % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("even");
        }
    }
}
