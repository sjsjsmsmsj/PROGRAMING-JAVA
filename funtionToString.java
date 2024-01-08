public class funtionToString {
    private String studentID;
    private int yob;
    private String name;
    public funtionToString(String studentID, int yob, String name) {
        this.studentID = studentID;
        this.yob = yob;
        this.name = name;
    }
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public int getYob() {
        return yob;
    }
    public void setYob(int yob) {
        this.yob = yob;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
   /*  @Override
    public String toString() {
        return String.format("|Student|%-10s|%4d|%-10s", studentID, yob, name);
    }
    */
    
}
