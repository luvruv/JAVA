import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("gcd");
        int a = input.nextInt();
        int b = input.nextInt();
        int gcd = Gcd(a, b);
        System.out.println("Gcd is: " + gcd);
    }
    public static int Gcd(int a, int b) {
        int gcd = 1;
        int i = 2;
        int least = least(a, b);
        while (i <= least) {
            if (a % i == 0 && b % i ==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
