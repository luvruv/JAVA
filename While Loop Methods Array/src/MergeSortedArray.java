import java.util.Scanner;
public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Merge Two Sorted Arrays");
        // First array input
        System.out.print("Enter size of first sorted array: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " sorted elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }
        // Second array input
        System.out.print("Enter size of second sorted array: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " sorted elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }
        // Merge both arrays
        int[] merged = mergeArrays(arr1, arr2);
        // Display merged sorted array
        System.out.println("Merged sorted array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        System.out.println();

        input.close();
    }
    //  Function to merge two sorted arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        // Merge elements in sorted order
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }
        // Copy remaining elements from arr1
        while (i < n1) {
            merged[k++] = arr1[i++];
        }
        // Copy remaining elements from arr2
        while (j < n2) {
            merged[k++] = arr2[j++];
        }
        return merged;
    }
}
