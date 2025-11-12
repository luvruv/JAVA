import java.util.Scanner;

public class ArraysumAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        int avg = avg(numArray);
        System.out.println(sum);
        System.out.println(avg);
    }
    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public static int avg(int[] numArray) {
        long sum = sum(numArray);
        return (int) (sum/numArray.length);
    }
}
