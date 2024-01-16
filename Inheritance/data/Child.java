package data;

public class Child extends Parent {

    public Child(String asset1, String asset2, String asset3) {
        super(asset1, asset2, asset3);
    }
    // ba sẽ là cánh chim cho con bay thật xa 
        // mượn hàm của cha Parent những hàm của cha con được sài
        // muốn cùng tên hàm với hàm cha thì hàm con phải overide 
        // khi gọi cha nhưng con chạy bởi vì con muốn được thể hiện bản chất của nó
        // đa nhân cách 
        
        public void showProfile() {
            System.out.println("Children asset 1: " + asset1 + " asset 2: " + asset2 + " asset 3: " + asset3);
        }
        // khi new cha mà gọi con thì con chạy
        // trỏ đến vùng override của con 
        // nhưng không trỏ đến những hàm riêng biệt của con được   
        
        // khi gọi hàm không có trong hàm cha
        public void introduceMySelf() {
            System.out.println("Children ");
        }
}
