public class StringManipulation {
    public static void main(String[] args) {
        String fistName = "dhruv";
        String lastName = "jain";
        // String fullName = fistName + " " + lastName;
        String fullName = fistName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
    }
}
