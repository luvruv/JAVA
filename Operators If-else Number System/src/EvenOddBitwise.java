import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Odd Even");
        System.out.println("enter the number: ");
        int num = input.nextInt();
        if ((num & 1) == 1) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
