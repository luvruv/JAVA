import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1st num: ");
        int num1 = input.nextInt();
        System.out.println("enter 2nd num: ");
        int num2 = input.nextInt();
        System.out.println("operations: ");
        String operation = input.next();
        int result = switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1;
        };
        System.out.println("your answer is: " + result);
    }
}
