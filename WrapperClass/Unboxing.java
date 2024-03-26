

public class Unboxing {
    public static void main(String args[]) {
        int num0 = 2023;
        Integer num1 = new Integer(2023);
        Integer num2 = new Integer("2023");
        Integer num3 = 2023;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        if(num1 == num3) {
            System.out.println("Okie");
        } else {
            System.out.println("Not okie");
        }
    }
}
