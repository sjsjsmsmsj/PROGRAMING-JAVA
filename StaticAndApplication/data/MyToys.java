package data;
import java.util.Scanner;
public class MyToys {
    public static final double PI = 3.14;
    private static Scanner sc = new Scanner(System.in);
    // final is a value not change 
    public static int getAnInteger(String inputMsg) {
        int n;
        
        while(1 > 0) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Do you know an integer!!!");
            }
        }
        
    }
}
