import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find occurrence of a specific element in an array");
        // Input array size
        System.out.print("Enter size of the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        // Input element to search
        System.out.print("Enter the element to find its occurrence: ");
        int key = input.nextInt();
        // Count occurrences using for-each
        int count = 0;
        for (int num : arr) {
            if (num == key) {
                count++;
            }
        }
        // Display result
        System.out.println("The element " + key + " occurs " + count + " time(s) in the array.");
        input.close();
    }
}
