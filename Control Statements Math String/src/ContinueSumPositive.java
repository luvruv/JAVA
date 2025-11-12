import java.util.Scanner;

public class ContinueSumPositive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers (0 to stop):");
        while (true) {
            int num = input.nextInt();
            if (num == 0) break;
            if (num < 0) continue; // skip negative numbers
            sum += num;
        }
        System.out.println("Sum of all positive numbers = " + sum);
        input.close();
    }
}
