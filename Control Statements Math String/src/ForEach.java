import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter number");
//        int num = input.nextInt();
        String[] array = new String[] {
                "ram", "shaym", "mohan", "sohan", "sita", "geeta",
        };
      //  printArray(array);
        printArrayForEach(array);
     }
    public static void printArrayForEach(String [] array) {
        for (String  name : array) {
            System.out.println(name);
        }
    }
     public static void printArray(String [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
     }
}
