package data;

public class Parent {
    @Override
    public String toString() {
        return "Parent [asset1=" + asset1 + ", asset2=" + asset2 + ", asset3=" + asset3 + "]";
    }
    public Parent(String asset1, String asset2, String asset3) {
        this.asset1 = asset1;
        this.asset2 = asset2;
        this.asset3 = asset3;
    }
    protected String asset1;
    protected String asset2;
    protected String asset3;
    public String getAsset1() {
        return asset1;
    }
    public void setAsset1(String asset1) {
        this.asset1 = asset1;
    }
    public String getAsset2() {
        return asset2;
    }
    public void setAsset2(String asset2) {
        this.asset2 = asset2;
    }
    public String getAsset3() {
        return asset3;
    }
    public void setAsset3(String asset3) {
        this.asset3 = asset3;
    }
    public void showProfile() {
        System.out.println("Parent asset 1: " + asset1 + " asset 2: " + asset2 + " asset 3 : " + asset3);
    }
}
