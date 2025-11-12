import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("set your password");
        String password;
        do {
            System.out.println("please enter your password");
            password = input.next();
        } while (!isValidPassword(password));
        System.out.println("valid password");
    }
    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }
}
