import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a num");
        int a = input.nextInt();
        System.out.println("fibonacci series");
        fib(a);
    }
    public static int fib(int a) {
        if (a < 0) return 0;
        System.out.println("0 ");
        if (a == 0) return 0;
        System.out.println("1 ");
        int first = 0, second = 1;
        while (first + second <= a) {
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }
        return 0;
    }
}
