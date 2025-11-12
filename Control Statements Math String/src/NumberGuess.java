import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5, guess;
        System.out.println("number guess game");
        do {
            System.out.println("please guess the number b/w 0-10");
            guess = input.nextInt();
        } while (num != guess);
        System.out.println("you have guessed");
    }
}
