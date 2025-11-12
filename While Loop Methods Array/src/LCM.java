import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your numbers");
        int num = input.nextInt();
        int num1 = input.nextInt();
        int lcm = Lcm(num, num1);
        System.out.println("lcm is: " + lcm);
    }
    public static int Lcm(int num, int num1) {
        int i = 1;
        while (i <= num1) {
            int factor = num * i;
            if (factor % num1 == 0) {
                return factor;
            }
            i++;
        }
        return 0; // while(true) so we do not have to right this statement
    }
}
