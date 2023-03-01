package Encapsulation;

public class Student {

    private String stdName;
    private int stdRollNumber;
    private int stdId;

    public String getStdName() {
        return stdName;
    }

    public int getStdRollNumber() {
        return stdRollNumber;
    }

    public int getStdId() {
        return stdId;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void setStdRollNumber(int stdRollNumber) {
        this.stdRollNumber = stdRollNumber;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public static void main(String[] args) {
        Student st = new Student();

        st.setStdName("prince");
        st.setStdRollNumber(02);
        st.setStdId(101);
        System.out.println("stdName"+st.getStdName());
        System.out.println("stdRollNumber"+st.getStdRollNumber());
        System.out.println("stdId"+st.getStdId());
    }
}
