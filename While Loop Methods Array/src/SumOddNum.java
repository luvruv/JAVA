import java.util.Scanner;

public class SumOddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Odd sum please enter your number: ");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("odd sum till" + num + " is: " +sum);
    }
    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
