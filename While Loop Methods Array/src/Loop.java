import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        while (a <= 100) {
//            System.out.println(a);
//            a = a + 1;
//        }

//        int b = 500;
//        while (b >= 200) {
//            System.out.println(b);
//            b = b - 1;
//        }

        int i = 0;
        while (i < 5) {
            int inp = input.nextInt();
            System.out.println("number is: " + inp);
            i = i + 1;
        }

    }
}