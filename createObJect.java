
public class createObJect {
    public static void main(String[] args) {
        obJect thinh = new obJect("Lâm gia Thịnh", 2005, "052205004137", "Bình định");
        //thinh.printInfo();// 1 object do behavior somthing
        obJect thien = new obJect ("Phan chi thien", 2005, "394934", "Binh dinh");
        // variable     object/ complex
        //thien.printInfo();
        System.out.println(thinh.getName());
        funtionToString thanh = new funtionToString("3985", 2005, "Lâm gia thịnh");
        System.out.println(thanh.toString());
        // không chấm toString thì tự gọi ngầm toString
        System.out.println(thanh);

        // không có hàm toString thì nó sẽ băm đó ra những con số hexa
        System.out.println(thanh);
    }
}
// che giấu nó, show nó ra khi cần thiết
// nó đại diện cho 1 object với đặc tính và hành vi nằm trọn 
// 1 khu vực
// kĩ thuật này gọi là ENCAPSULATION(đóng gói)