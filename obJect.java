public class obJect {
    // object 
    // là khuôn để đúc ra các object, đối tượng cần lưu trữ info, thứ làm ra để bán
    // khuôn tạo ra phải kín để chứa và có cái phễu để chế để rót vào data hoặc nguyên liệu
    // ví dụ: căn cước công dân gồm: số iD, nơi sinh, năm sinh
    
    // đây là ví dụ thực tế: ta tạo ra tờ giấy có thông tin gì in ra đồng loạt để ngừoi khác viết vào 
    private String name;
    private int age;
    private String numberID;
    private String placeOfBirth;

    // bây giờ cần chỗ để điền vào đó chính là khuôn

    public obJect(String name, int age, String numberID, String placeOfBirth) {
        this.name = name; // this.name tên mình viết vào chỗ cần điền
        this.age = age;   // this.age tuổi của mình viêts vào chỗ cần điền 
        this.numberID = numberID; // this.numberID là số căn cước công dân của mình vào chỗ cần điền 
        this.placeOfBirth = placeOfBirth; // this.placeOfBirth là nơi sinh của mình điền vào để đăng kí
    }
    // đúc tạo dựng construction 
    // phễu là 1 hàm cực kì đặc biệt vì tạo ra 1 obJect 
    // 1 bộ hồ sơ được tạo ra 
    // Constructor là hàm cực kì đặc biệt vì tạo ra obJect 
    // mỗi lần sài nó thì phải đưa vật liệu vào 
    // tức là có 1 obJect mới
    // phễu là hàm đặc biệt không có trả về giá trị trả về không có void luôn
    // trả về cả cái căn cước luôn
    // tên giống tên class 100% 
    public void printInfo() {
        System.out.println("Name" + name + " " + "Age: " + age + " " +  "numberID: " + numberID + " " + "Place of birth: " + " " + placeOfBirth);
    }
    // thích show information

    // mình đi xăm mình nhuộm tóc
    // thay đổi info ba má đã từng cho lúc ba má new/ đúc ra mình
    public void setName(String name) {
        name = this.name;
    }
    // vì mình mặc định info được che giấu, khi mình giao tiếp mình bật nó ra
    // chia sẻ info khi được hỏi, đó chính là method hàm hành đọng get()
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        age = this.age;
    }
    public int getAge() {
        return age;
    }
    public void setNumberID(String numberID) {
        numberID = this.numberID;
    }
    public String getNumberID() {
        return numberID;
    }
    public void setPlaceOfBirth(String placeOfBirth) {
        placeOfBirth = this.placeOfBirth;
    }
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }
}
