import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the num");
        int a = input.nextInt();
        int reverse = reverse(a);
        System.out.println("Reverse of your number is: " + reverse);
    }
    public static int reverse(int a) {
        int newNum = 0;
        while (a > 0) {
            int digit = a % 10;
            newNum = newNum * 10 + digit;
            a /= 10;
        }
        return newNum;
    }
}
