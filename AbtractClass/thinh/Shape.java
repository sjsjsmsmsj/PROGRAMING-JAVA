package thinh;
// class tổ của muôn hình từ tổ sinh ra rất nhiều con cháu, các loại khuôn khác nhau
// nhưng cùng series(vẽ) éo phải series chụp hình (Picture)
// tổ sinh ra nhanh các khuôn vuông tròn chữ nhữ, tam giác, hình binh hành, vì chúng đều là hh
// tổ sẽ có gì để bọn kia nhanh hơn, kế thừa đó 
//                bọn kia vẫn có quyền biến dị
public abstract class Shape {
    protected String color;
    protected String owner;
    protected String borderColor;
    // nếu nhập cạnh thì sai vì có nhiều cạnh khác nhau
    // như tròn thì chỉ cần r
    // còn hình tam giác 3 cạnh

    // diện tích, chu vi luôn tính được cho các hình
    // mà nên làm hàm

    public Shape(String color, String owner, String borderColor) {
        this.color = color;
        this.owner = owner;
        this.borderColor = borderColor;
    }
    // phải làm hàm abstract vì các hình tính diện tích khác nhau, chính là khái niệm nên được gọi là abstract
    public abstract double getArea();  // hàm không code, hàm khái niệm
        // code không viết được
        // đưa ý tưởng cho các class con làm
    public abstract double getPremeter();
        // code không viết được
        // đưa ý tưởng cho các class con 
        // có tồn tại nhưng không cụ thể
    public abstract void paint();
}
