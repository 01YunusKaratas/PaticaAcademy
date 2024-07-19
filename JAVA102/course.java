package JAVA102;

public class course {

    private String courseName;
    private String code;
    private ınstructor ınsructor1;

    public course(String courseName, String code, ınstructor ınstructor1) {
        this.code = code;
        this.courseName = courseName;
        this.ınsructor1 = ınstructor1;

    }

    // average calculate

    // course uses to student yani kurs sınıfı ögrenci sınıfına bağlı
    public double average(student[] arry) {
        double total = 0;
        for (int i = 0; i < arry.length; i++) {

            total += arry[i].getNote();

        }

        double avg = total / arry.length;
        return avg;

    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;

    }

    public String getCourseName() {
        return this.getCourseName();
    }

    public void setCode(String code) {
        this.code = code;

    }

    public String getCode() {
        return this.code;
    }

    public ınstructor getInsructor1() {
        return ınsructor1;
    }

    public void setInsructor1(ınstructor ınsructor1) {
        this.ınsructor1 = ınsructor1;
    }

}
