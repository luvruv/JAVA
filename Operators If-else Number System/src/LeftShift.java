import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcase of leftshift operator");
        System.out.println("please enter num");
        int num = input.nextInt();
        int t = num << 4;
        System.out.println("The result is: " + t);
    }
}
