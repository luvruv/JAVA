import java.util.Scanner;

public class ContinueEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = input.nextInt();
        System.out.println("Even numbers up to " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) continue; // skip odd numbers
            System.out.print(i + " ");
        }
        input.close();
    }
}
