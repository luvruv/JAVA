import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("multiplication table- please enter your num: ");
        int num = input.nextInt();
        printTable(num);
    }
    public static void printTable(int num) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "X" + i + " = " + (num * i));
            i++;
        }
    }
}
