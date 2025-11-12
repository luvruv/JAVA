import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        while (num <= 100) {
            System.out.println( num + " ");
            num++;
        }
        for (int j = 1; j <= 100; j++) {
            System.out.print(j + " ");
        }
    }
}
