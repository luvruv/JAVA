import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class MonthOfTheYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num month");
        int monthNum = input.nextInt();
        String monthName = getMonthName(monthNum);
        System.out.println("your month name is: " + monthName);
    }
    public static String getMonthName(int monthNum) {
        String monthName = switch (monthNum) {
            case 1 -> "jan";
            case 2 -> "feb";
            case 3 -> "mar";
            case 4 -> "apr";
            case 5 -> "may";
            case 6 -> "jun";
            case 7 -> "jul";
            case 8 -> "aug";
            case 9 -> "sep";
            case 10 -> "oct";
            case 11 -> "nov";
            case 12 -> "dec";
            default -> "invalid";
        };
        return null;
    }
}
