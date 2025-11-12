import java.util.Scanner;
// create a program that determines if a given year is a leap year(considering conditions like divisible by 4 but not 100, unless also divisble by 400.
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("new year");
        System.out.println("year");
       int year = input.nextInt();
//        if (year % 400 == 0) {
//            System.out.println("leap year");
//        } else if (year % 100 == 0) {
//            System.out.println("not leap year");
//        } else if (year % 4 == 0) {
//            System.out.println("leap year");
//        } else {
//            System.out.println("not leap year");
//        }
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }
    }
}
