import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("array deletion");
        System.out.print("Enter size of the array: ");
        int n = input.nextInt();
        int[] numArr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numArr[i] = input.nextInt();
        }
        System.out.println("now enter the number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("new array");
        displayArray(newArr);
    }
    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = 0;
        for (int num : numArr) {
            if (num == numToDelete) {
                occ++;
            }
        }
        if (occ == 0) {
            System.out.println("Number not found in array!");
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];
        int j = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] != numToDelete) {
                newArr[j++] = numArr[i];
            }
        }
        return newArr;
    }
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}