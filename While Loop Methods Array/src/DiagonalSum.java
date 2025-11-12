import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sum of Two Diagonals in a Matrix");
        // Input matrix size (square)
        System.out.print("Enter size of square matrix (n x n): ");
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        // Input elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int primarySum = 0;
        int secondarySum = 0;
        // Calculate diagonal sums
        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];              // Primary diagonal
            secondarySum += arr[i][n - 1 - i];    // Secondary diagonal
        }
        int totalDiagonalSum = primarySum + secondarySum;
        // If n is odd, subtract the middle element (counted twice)
        if (n % 2 == 1) {
            totalDiagonalSum -= arr[n / 2][n / 2];
        }
        // Display results
        System.out.println("\nPrimary diagonal sum = " + primarySum);
        System.out.println("Secondary diagonal sum = " + secondarySum);
        System.out.println("Total diagonal sum (without double count) = " + totalDiagonalSum);

        input.close();
    }
}
