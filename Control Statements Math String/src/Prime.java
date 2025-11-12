import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("prime number");
        int num = input.nextInt();
        // boolean isprime = isprime(num);
        System.out.println("youre num is " + (isprime(num) ? "prime" : "not prime"));
    }
    public static boolean isprime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

