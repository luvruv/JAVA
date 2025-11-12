import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter numbers: ");
        int a = input.nextInt();
        boolean prime = prime(a);
        if (prime) {
            System.out.println("num is prime");
        } else {
            System.out.println("not prime");
        }
    }
    public static boolean prime(int a) {
        int i = 2;
        while (i < a) {
            if (a % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
