import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values (type 'exit' to stop):");

        while (true) {
            String data = input.nextLine();
            if (data.equalsIgnoreCase("exit")) {
                System.out.println("Loop exited!");
                break;
            }
            System.out.println("You entered: " + data);
        }

        input.close();
    }
}
