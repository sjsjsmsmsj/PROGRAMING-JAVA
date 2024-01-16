import java.util.Scanner;

import data.Student;
public class Shelf {
    // đặc điểm của  1 cái tủ bất kì là gì: màu sơn: ;
    // số ngăn/ không gian chứa đồ: ______ các món đồ nhét vào
    // chứa nhiều đồ, nhiều object rõ ràng đến thời điẻm này là ta cần mảng object
    // tủ sẽ chứa chứa1 list/ mảng mản/ danh sách các đối tượng
    // ứng dụng của mảng, góp phần tạo dựng nên object
    // OOP: tìm các object, chúng phối hợp, trộn nhau
    private String color;
    private String label;
    private int count = 0;
    private Student[] list = new Student[300];
    private Scanner sc = new Scanner(System.in);
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }
    public void inputAStudent() { 
        String id, name;
        int yob;
        double gpa;
            System.out.println("Input student " + (count + 1) + "/" + list.length);
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
            list[count] = new Student(id, name, yob, gpa);
            count ++;
        }
        public void printStudentList() {
            System.out.println("The student list");
            for (int i = 0; i < count; i ++) {
                list[i].showProfile(); 
            }
        }
}
