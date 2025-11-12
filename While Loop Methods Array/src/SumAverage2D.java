import java.util.Scanner;

public class SumAverage2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sum and Average of All Elements in a 2D Array");
        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();
        int[][] arr = new int[rows][cols];
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        // Calculate sum and average
        int sum = 0;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        double average = (double) sum / count;
        // Output
        System.out.println("\nSum of all elements = " + sum);
        System.out.println("Average of all elements = " + average);
        input.close();
    }
}
