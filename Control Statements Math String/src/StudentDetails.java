public class StudentDetails {
    String name;
    int age;
    String rollNumber;
    String house;
    public StudentDetails(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }
    @Override
    public String toString() {
        return "Student Details: { " +
                "Name: " + name +
                ", Age: " + age +
                ", Roll Number: " + rollNumber +
                ", House: " + house +
                " }";
    }
    public static void main(String[] args) {
        StudentDetails stu = new StudentDetails("Dhruv", 20, "23CS101", "Lucky");
        System.out.println(stu);
    }
}
