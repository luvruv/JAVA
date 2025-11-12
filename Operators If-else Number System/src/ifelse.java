public class ifelse {
    public static void main(String[] args) {
//        boolean isMale = true;
        boolean isMale = false;
        String name = "Vicky";
        System.out.println("Before if");
        if (isMale) {
            System.out.println("Mr." + name);
        } else {
            System.out.println("Ms." + name);
        }
        System.out.println("After if");

        boolean isSenior = true;
        boolean isAnAdult = false;
        if (isSenior) {
            System.out.println("Hello Senior Citizen");
        } else {
            if (isAnAdult) {
                System.out.println("Hello Adult");
            } else {
                System.out.println("hello child");
            }
        }
    }
}
