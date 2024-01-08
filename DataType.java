public class DataType {
    public static void main(String[] args) {
        //playWithVariables();
        //playWithIntegers();
        //playWithDoubles();
        //playWithCharacters();
        //playWithBooleans();
        printIntegerList(100);
    }
    // static thì chỉ chơi với static 
    public static void playWithVariables() {
        // biến là 1 vùng ram được đặt tên, chiếm 1 số byte nhất định tuỳ loại
        // dữ liệu/ thông tin mà nó sẽ chứa bên tring - dât type - hình thức data
        // số., chữ, ảnh, ....
        // biến là cách đặt teen cho 1 đại lượng, 1 giá trị, 1 giá trị đơn, phức
        int a, b, c;
        // chiếm 12 byte trong Ram, mỗi biến int tốn 4 byte
        a = 10;
        System.out.println("a = " + a); // in ký tự a ra màn hình // ~~ printf("a = %d\n", a);
        b = a - 5;
        System.out.println("b = " + b); // tương tự cách in dưới nhưng không cần đặt biến
        System.out.println("a = " + (a - 5)); 
    }
    public static void playWithIntegers() {
        int n = 2005;
        System.out.println("n = " + n);
        // long m = 3000000000;  nếu không có chữ L sẽ gặp lỗi do tràn số
        long m = 3000000000L; 
        System.out.println("m = " + m);
        int s = 0XFA;
        System.out.println("s = " + s);
        
        // muốn lưu số như số điện thoại 
        // mình chuyển về hệ cơ số 8
        int phone = 010;
        System.out.println("phone: " + phone);
    }
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi = " + pi);
        System.out.printf("pi : %2f\n", pi); // cấm sử dụng %lf
    }
    public static void playWithCharacters() {
        char m = '$';
        System.out.println("unit : " + m);
        String name = "Lâm Gia Thịnh";
        System.out.println("Name: " + name);
        // hàm charAt(số cần lấy trong mảng) mảng a[k] k là ví dụ thôi k chạy từ [0; k - 1]
        System.out.println("Take your character: " + name.charAt(0));
        System.out.println("Name: " + name.toLowerCase());
    }
    public static void playWithBooleans() {
        boolean t = false;
        if(t == true) {
            System.out.println("Thịnh đẹp trai");
        }
        else {
            System.out.println("Thịnh quá đẹp trai");
        }
    }
    public static void printIntegerList(int n) {
        System.out.println("This is an list included 100 values integers");
        for(int i = 1; i <= n; i ++) {
            System.out.print(i + " ");
        }
    }
}