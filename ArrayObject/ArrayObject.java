
import java.util.Scanner;

import data.Student;
public class ArrayObject { 
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // playWithStudentObject();
        // sortStudents();
        inputStudentList();
    }
    public static void playWithStudentObject() {
        Student arr[] = new Student[3]; // I need ? variable objection // arr. sổ ra length
        // [] for variables
        arr[0] = new Student("SE2005", "Lam Gia Thinh", 2005, 5); // arr[0]. sổ ra những gì mà public bên class Student
        arr[1] = new Student("SE2006", "Nguyen Nhat Thanh", 2006, 6);
        arr[2] = new Student("SE2007", "Phan Chi Thien", 2007, 7);
        //System.out.println(arr[1].getName().toUpperCase());
        System.out.println("The list of students");
       /*  for (int i = 0; i < arr.length; i ++) {
            arr[i].showProfile();
            System.out.println();
        }*/
        // arr[3] = null; // trỏ xuống đấy ram, null, làm biếng new
                            // có value rồi, số 0, toạ độ 0 ở đáy ram, đi vào 00000
        // NGUYÊN TẮC KHI CHƠI VỚI MẢNG PHẢI LÀ: BIẾN COUNT ĐỂ CHO BIẾT
        // MẢNG ĐÃ GÁN VALUE ĐẾN ĐÂU, FOR ĐẾN ĐÓ, KHÔNG FOR ĐẾN .LENGTH
        // BỊ DEFAULT VỚI PRIMITIVE, BỊ NULL VỚI MẢNG OBJECT
        for (Student x : arr) {
            // x = arr[0]; x = arr[1]; x = arr[2] // x and arr[0] pointer new (Lam Gia Thinh)
                                                  // x and arr[1] pointer new (Nguyen Nhat Thanh)
            x.showProfile();
            System.out.println();
        }
    }
    public static void sortStudents() {
        Student arr[] = new Student[3]; // I need ? variable objection // arr. sổ ra length
        // [] for variables
        arr[0] = new Student("SE2008", "Lam Gia Thinh", 2008, 8); // arr[0]. sổ ra những gì mà public bên class Student
        arr[1] = new Student("SE2006", "Nguyen Nhat Thanh", 2006, 6);
        arr[2] = new Student("SE2007", "Phan Chi Thien", 2007, 7);
        for (int i = 0; i < arr.length - 1; i ++) {
            for(int j = i + 1; j < arr.length; j ++) {
                if(arr[i].getGpa() > arr[j].getGpa()) {
                    Student tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println("List student after sorting ");
        for (int i = 0; i < arr.length; i ++) {
            arr[i].showProfile();
            System.out.println();
        }
    }
    /**
     * 
     */
    public static void inputStudentList() {
        
        String id, name;
        int yob, count;
        double gpa;
        System.out.println("How many students do you want to input ?");
        count = Integer.parseInt(sc.nextLine());
        Student[] arr = new Student[count];
        for(int i = 0; i < count; i ++) {
            System.out.println("Input student " + (i + 1) + "/" + count);
            System.out.print("Input id: ");
            id = sc.nextLine();
            System.out.print("Input name: ");
            name = sc.nextLine();
            while(1 > 0) {
                try {
                    System.out.print("Input yob: ");
                    yob = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Do you know integer ???");
                }
            }
            while(1 > 0) {
                try {
                    System.out.print("Input gpa: ");
                    gpa = Double.parseDouble(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Do you know double ???");
                }
            }
            arr[i] = new Student(id, name, yob, gpa);
        }
        for (Student x : arr) {
                x.showProfile();
            }
    }
}
