import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to arithmetic calculator\n");
        System.out.println("Please enter 1st number: ");
        int first = input.nextInt();
        System.out.println("Please enter 2st number: ");
        int second = input.nextInt();
        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int mod = first % second;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        // product of two floating points numbers
        System.out.println("float mul");
        System.out.println("Enter 1st decimal num: ");
        double first1 = input.nextDouble();
        System.out.println("Enter 2st decimal num: ");
        double second2 = input.nextDouble();
        System.out.println(first1 * second2);

        // perimeter of a rectangle
        System.out.println("length");
        int a = input.nextInt();
        System.out.println("width");
        int b = input.nextInt();
        System.out.println("Perimeter of rectangle = " + (2 * (a+b)));


        // area of triangle
        System.out.println("length");
        int A = input.nextInt();
        System.out.println("width");
        int B = input.nextInt();
        System.out.println("Area of triangle = " + ( 0.5 * (A * B)));
    }
}
