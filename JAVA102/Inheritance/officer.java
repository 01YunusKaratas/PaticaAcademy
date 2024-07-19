package JAVA102.Inheritance;

public class officer extends worker {

    private String departman;
    private String shift;

    // consructor
    public officer(String fullName, String phoneNumber, String email, String departman, String shift) {
        super(fullName, phoneNumber, email);
        this.departman = departman;
        this.shift = shift;
    }

    public void worked() {

        System.out.println(this.getFullName() + " officer starting to worked.");
    }

    public void setDepartman(String departman) {

        this.departman = departman;
    }

    public String getDepartman() {

        return this.departman;
    }

    public void setShift(String shift) {

        this.shift = shift;
    }

    public String getShift() {

        return this.shift;
    }

}
