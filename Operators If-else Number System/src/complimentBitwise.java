import java.util.Scanner;

public class complimentBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcase of not/vcompliment operator");
        System.out.println("please enterv num");
        int num = input.nextInt();
        int t = ~num;
        System.out.println("The result of ~" + num + " is: " + t);
        input.close();
    }
}
