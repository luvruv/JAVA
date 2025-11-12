import java.util.Scanner;

public class OccurrencesElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("array occurrernces");
        int[] numArrr = ArrayUtility.inputArray();
        System.out.println("number you want to find: ");
        int num = input.nextInt();
        int occurences = noOfarray(numArrr, num);
        System.out.println("your elemnt was found " + occurences + "times in the array" );
    }
    public static int noOfarray(int[] numArrr, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArrr.length) {
            if (numArrr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
