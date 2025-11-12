import java.util.Scanner;

public class greatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("3 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a >= b && a >= c) {
            System.out.println("a is greatest"); 
        } else if (b >= c) {
            System.out.println("b is greatest");
        } else {
            System.out.println("c is greatest");
        }
    }
}
