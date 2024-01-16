import data.*;
public class Stage {
    public static void main(String args[]) {
        playWithPointer();
    }
    public static void playWithPointer() {
        Parent p = new Parent("Nha", "Xe", "Vang");
        p.showProfile();
        Child c = new Child("xe", "nha", "ngu");
        c.showProfile();
        // khai cha nhung new child 
        // showProfile cua CHILD chay
        Parent p1 = new Child("Hello", "World", "I am lam gia thinh");
        p1.showProfile();

        // new cha nhưng gọi hàm không có trong hàm cha chỉ có trong hàm của con
        // thì chỉ không chạy
        Parent p2 = new Child("Hello", "Binh Dinh", "I am from binh dinh");
       // p2.introduceMySelf(); // lỗi
       // khi p2 là child thì sẽ không lỗi
       Child t1 = (Child)p2;
       t1.introduceMySelf();
    }
}
