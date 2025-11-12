import java.util.Scanner;

public class MaxMinElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("min and max");
        int[] numArr = ArrayUtility.inputArray();
        int max = max(numArr);
        int min = min(numArr);
        System.out.println("max" + max);
        System.out.println("min" + min);
    }
    public static int max(int[] numArr) {
        if (numArr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i = 1;
        i++;
        while (i < numArr.length) {
            if (max < numArr[i]) {
                max = numArr[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] numArr) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArr.length) {
            if (min > numArr[i]) {
                min = numArr[i];
            }
            i++;
        }
        return min;
    }
}
