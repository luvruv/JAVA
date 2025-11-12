import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number checker");
        System.out.println("enter number: ");
        int num1 = input.nextInt();
        System.out.println("now enter the 2nd num");
        int num2 = input.nextInt();
//        int greaterInt;
//        if(num1 > num2) {
//            greaterInt = num1;
//        } else {
//            greaterInt = num2;
//        }
        int greaterInt = num1 > num2 ? num1 : num2;
        System.out.println(greaterInt + " is greater");
    }
}