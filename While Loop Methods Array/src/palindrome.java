import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("palindrome no.");
        int num = input.nextInt();
        boolean ispalidrome = ispalidrome(num);
        if (ispalidrome) {
            System.out.println("palindrme");
        } else {
            System.out.println("not palindrome");
        }

    }
    public static boolean ispalidrome(int num) {
//        int reverse = reverse(num);
//        return num == reverse;
        return num == reverse(num);
    }
    public static int reverse(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
