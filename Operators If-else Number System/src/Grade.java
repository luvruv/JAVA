import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your percentage");
        float p = input.nextFloat();
        if (p >= 90) {
            System.out.println("grade A");
        } else if (p >= 75) {
            System.out.println("grade B");
        } else if (p > 60) {
            System.out.println("grade c");
        } else if (p >= 30) {
            System.out.println("grade d");
        } else {
            System.out.println("failed");
        }
    }
}
