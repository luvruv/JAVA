import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Armstrong no. ");
        int num = input.nextInt();
        boolean armstrong = armstrong(num);
        if (armstrong) {
            System.out.println(num + " number is armstrong");
        } else {
            System.out.println(num + " number is not armstrong");
        }
    }
    public static boolean armstrong(int a) {
        int acopy = a;
        int noofdigits = number(a);
        int finalNumber = 0;
        while (a > 0) {
            int digits = a % 10;
            a /= 10;
            finalNumber += pow(digits, noofdigits);
        }
            return finalNumber == acopy;
    }
    public static int pow(int a, int b) {
        int result = a;
        int i = 1;
        while (i < b) {
            result *= a;
            i++;
        }
        return result;
    }
    public static int number(int a) {
        int digits = 0;
        while (a > 0) {
            digits++;
            a /= 10;
        }
        return digits;
    }
}
