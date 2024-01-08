import java.util.Scanner;

class StudentProfile {
    public static void main(String[] args) {
        inputProfile();
    }
    public static void inputProfile() {
        String name, address;
        int yob; 
        Scanner sc = new Scanner(System.in);
        while(1 > 0) {
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Do you know input integer !!!");
            }
        }
        
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        System.out.print("Input address: ");
        address = sc.nextLine();
        System.out.println("Here are your profile ");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }
}