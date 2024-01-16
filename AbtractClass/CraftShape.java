
import thinh.*;
public class CraftShape {
    public static void main(String args[]) {
        playWithShapes();
    }
    public static void playWithShapes() {
        Rectangle r1 = new Rectangle( "Cam", "thinh", "Xanh", 2, 3);
        r1.paint(); // chạy hàm con
        Shape r2 = new Rectangle( "Do", "Ma", "Tim", 3, 4);
        r2.paint(); //  hàm của cha, nhưng con qua mặt là chạy hàm con

        Disk d1 = new Disk("Do", "Love", "Do", "hic", 4);
        Shape d2 = new Disk("Hong", "Nhok", "Hong", " haha", 5);
        
        d1.paint(); // chạy hàm của con 
        d2.paint(); //  hàm của cha, khi chạy con qua mặt là chạy hàm của con
    }
}
