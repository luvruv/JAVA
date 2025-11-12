import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcase of Right Shift Operator (>>)");
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int t = num >> 1;
        System.out.println("After right shifting " + num + " by 4 bits, the result is: " + t);
    }
}
