package JAVA102.Inheritance;

public class academian extends worker {

    private String department;
    private String rank;

    public academian(String fullName, String phoneNumber, String email, String department, String rank) {
        super(fullName, phoneNumber, email); // extends from worker.
        this.department = department;
        this.rank = rank;

    }

    public void attendingLesson() {
        System.out.println(this.getFullName() + "  atteded in the lesson.");
    }

    // setter and getter method for all variables
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

}
