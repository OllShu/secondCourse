package functional;

public class Statement {
    private String studentName;
    private int creditedWorks;

    public Statement(String studentName, int creditedWorks) {
        this.studentName = studentName;
        this.creditedWorks = creditedWorks;
    }

    public String getStudentName() {return studentName;}

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getCreditedWorks() {return creditedWorks;}

    public void setCreditedWorks(int creditedWorks) {
        this.creditedWorks = creditedWorks;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "studentName='" + studentName + '\'' +
                ", creditedWorks=" + creditedWorks +
                '}';
    }

}
