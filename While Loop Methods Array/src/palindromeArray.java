import java.util.Scanner;

public class palindromeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Check if an array is Palindrome");
        System.out.print("Enter size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        boolean isPalin = isPalindrome(arr);
        if (isPalindrome(arr)) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
        input.close();
    }
    public static boolean isPalindrome(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
