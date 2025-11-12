import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("please enter age");
//        int age = input.nextInt();
//        while (age < 0 || age > 100) {
//            System.out.println("please enter your age: ");
//            age = input.nextInt();
//        }
        int age;
        do {
            System.out.println("please enter age");
            age = input.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("youre age is: " + age);
    }
}
