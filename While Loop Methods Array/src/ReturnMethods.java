import java.util.Scanner;

public class ReturnMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = readNumber() + 1;
        int b = readNumber();
        int sum = a + b;
        System.out.println(sum);

    }
    public static int readNumber(){
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        return c;
    }
}
