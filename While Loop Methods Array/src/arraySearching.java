import java.util.Scanner;

public class arraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {6, 7, 89, 98, 5, 88, 656, 99};
        System.out.println("enter the number you want to search: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("number was found in the array");
        } else {
            System.out.println("number was not found in the array");
        }
    }
    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }
        return false;
    }
}
