import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        // printIntegers();
        //f(5);
        System.out.println(f(100L)); // truyền tham trị
        
    } 
    // hàm void không có tham số truyền vào thì sẽ phải nhập giá trị cứng hoặc nhập từ bàn phím vào trong hàm cần nhập
    // hàm void là hàm không có đầu ra nên phải cho biết in ra gì luôn
    public static void printIntegers() {
        Scanner sc = new Scanner(System.in); // nhập từ bàn phím
        int n;
        System.out.print("Please input value for n: ");
        n = sc.nextInt();
        // ví dụ cho in từ 1 đến n
        for(int i = 1; i < n; i ++) {
            System.out.print(i + " ");
        }
    }
    // hàm void có tham số truyền vào thì sẽ phải nhập giá trị trong hàm main hoặc cho cứng 
    // để truyền tham số vào 
    // ví dụ: f(x) 
    // ta truyền vào x
    // ví dụ: hàm bậc 1: bx + c, a b c ta cho sẵn trước để dễ ví dụ
    public static void f(int x) {
        // trong này mà cho scanf là không điểm không có nhưng bởi vì 
        // f(x) cho x vào thì bị tào lao
        int k = 2*x + 5;
        System.out.printf("f(%d) = %d\n", x, k);
    }
    // hàm int là hàm trả về giá trị 
    // Nếu in cũng là 0 điểm ko có nhưng nhé
    // hàm int đầu tiên ví dụ là không truyền từ ngoài vào
    // ví dụ tính tổng từ 1 đến n ...
     // hiện tượng 1 class bất kì chứa nhiều hàm trùng tên nhưng khác phần tham số đầu vào 
    // mà phải trên data type hứ không phải khác tên biến >>> là hiện tượng overloading - quá tải hàm
    public static int f() {
        int sum = 0; // khởi tạo giá trị = 0 bởi vì nếu không có giá trị là không như bên Languages C 
                    // không gán vào trước sẽ không chạy được chưogn trình
        // tính tổng từ 1 đến 100 
        // được phép nhập vào vì hàm chưa có giá trị truyền vào
        for(int i = 1; i <= 100; i ++) {
            sum += i;
        }
        return sum;
    }
    public static int f(long m) {
        int sum = 0;
        for(int i = 1; i < 100; i ++) {
            sum += i;
        }
        return sum;
    }
}
