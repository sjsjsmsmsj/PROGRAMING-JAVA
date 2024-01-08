import java.util.Scanner;

import data.Student;
class StudentManagement {
    public static void main(String[] args) {
        inputAStudent();
    }
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        id = sc.nextLine();
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        Student thinh = new Student(id, name, yob, gpa);
        thinh.showProfile();
    }
}