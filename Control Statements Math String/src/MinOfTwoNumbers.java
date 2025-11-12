import java.util.Scanner;

public class MinOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = input.nextInt();
        System.out.println("second number");
        int num2 = input.nextInt();
        MinOfTwoNumbers ternary = new MinOfTwoNumbers();
        int min = ternary.min(num, num2);
        System.out.println("min num is: " + min);
    }
    public int min(int num, int num1) {
        return num < num1 ? num : num1;
//        if (num < num1) {
//            return num;
//        } else {
//            return num1;
//        }
    }
}
