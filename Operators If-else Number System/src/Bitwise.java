import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the 1st num");
        int first = input.nextInt();
        System.out.println("please enter the 2st num");
        int second = input.nextInt();
        int result = first & second; // bitwise and
        System.out.println("result is: " + result);


        System.out.println("please enter the 1st num");
        int first1 = input.nextInt();
        System.out.println("please enter the 2st num");
        int second2 = input.nextInt();
        int result12 = first | second; // bitwise or
        System.out.println("result is: " + result);



        System.out.println("please enter the 1st num");
        int a = input.nextInt();
        System.out.println("please enter the 2st num");
        int b = input.nextInt();
        int c = first ^ second; // bitwise xor
        System.out.println("result is: " + result);
    }
}
