public class MyMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-99));
        System.out.println(Math.ceil(5.07));
        System.out.println(Math.floor(5.07));
        System.out.println(Math.round(5.07));
        System.out.println(Math.max(34, 64));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.exp(45));
        System.out.println(Math.log(6));
        System.out.println(Math.random());
        for (int i = 0; i < 10; i++) {
            double random = (int) Math.round(Math.random() * 100);
            System.out.println(random);
        }
    }
}
