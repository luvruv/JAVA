import java.util.Scanner;

public class MaxValueArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Max value array finder");
        // Input array size
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        // Input elements
        for (int i = 0; i < size; i++) {
            System.out.print("Please enter element no " + (i + 1) + ": ");
            nums[i] = input.nextInt();
        }
        // Find maximum value
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        // Display result
        System.out.println("Maximum number is: " + max);

        input.close();
    }
}
