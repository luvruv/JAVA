import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[1] = 9;
//        myArr[2] = 8;
//        myArr[3] = 94;
//        myArr[4] = 5;
        int[] myArr = {98, 9, 8, 94, 5};
//        int index = 2;
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
//        System.out.println(myArr[index]);
        // array traversal
        int index = 0;
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }
        String[] strArr = new String[4];
        strArr[0] = "My String";
        String[] newStrArr = {"frist", "second", "third"};
        System.out.println(newStrArr.length);
    }
}
