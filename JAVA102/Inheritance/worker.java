package JAVA102.Inheritance;

public class worker {
    // variables
    private String fullName;
    private String phoneNumber;
    private String email;

    // constructor
    public worker(String fullName, String phoneNumber, String email) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    public void open() {

        System.out.println(this.fullName + " entered the university");

    }

    public void exit() {
        System.out.println(this.fullName + " exited the university");
    }

    public void cafeteria() {
        System.out.println(this.fullName + "  entered the cafeteria  ");
    }

    // setter and getter method for all variable.

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {

        return this.fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {

        return this.phoneNumber;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getEmail() {

        return this.email;
    }

}
