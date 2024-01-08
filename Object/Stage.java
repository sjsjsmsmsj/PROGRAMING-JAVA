import object.Student;
class Stage {
    public static void main(String[] args) {
        Student s1 = new Student("20934", "lam gia thinh", 2005, 4);
        // reference var     object
        //"pointer" var      instance, thể hiện, hiện thân, bức tượng
        Student s = s1;
        // s1 đang nắm/ lưu toạ độ vùng ram object trong heap
        // new làm cực kì nhiều việc
        // 1. clone khuôn (object và static)
        // 2. goị phễu đổ data vào vùng clone 
        // 3. chốt lại toạ đọ vùng new vừa rồi, đem toạ độ đi gán biến con trỏ 
        
        //s1 là biến, vậy nó có thể thay đổi value 
        // sếp với bạn trẻ đang trỏ đén ca sĩ
        // sếp với người đi làm, tro đến ôn/ bà quyết định lương cho mình
        // sếp tham chiếu người này người kia

        s1 = new Student("23703881", "Lâm Gia Thinh", 2005, 4);
        s1.showProfile();

        // biến object là tay cầm con diều, new chính là con diều
        // khi tay cầm nói dây con diều mới, con diều cũ không còn chơi nữa, đứt sợi dây, bay mất
        // 1 vùng ram new Object mà không còn ai trỏ tới, JVM có chướng trình ngầm gọi là
        // ct MTDT, Garbage collector, đi gom những vùn new mồ côi không con trỏ 
        System.out.println("s1 được lưu vào s");
        s.showProfile();
        // 1 biến có quyền trỏ vùng new, giữ lại thinh được không ?


    }
}