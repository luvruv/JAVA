import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Good Morning," + name);
        System.out.println(name + ", also tell me your age");
        int age = input.nextInt();
        System.out.println("Your age is:" + age);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a+b);

        System.out.println("Please enter your name: ");
        Scanner Input = new Scanner(System.in);
        String Name = Input.nextLine();
        System.out.println("welcome " + name + " bml");
    }
}