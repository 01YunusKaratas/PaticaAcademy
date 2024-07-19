package JAVA102.Inheritance;

public class lectuter extends academian { // öğretim görevlisi
    private String doorNumber;

    // constructor
    public lectuter(String fullName, String phoneNumber, String email, String department, String rank) {
        super(fullName, phoneNumber, email, department, rank);
        this.doorNumber = doorNumber;
    }

    public void takeExam() {
        System.out.println(this.getFullName() + this.getDepartment() + "  will do exam ");
    }

    public void senateMeeting() {
        System.out.println(this.getFullName() + "attended " + this.getDepartment() + " senate meeting");
    }

    // getter and setter
    public void setDoorNumber(String doorNumber) {

        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {

        return this.doorNumber;
    }
}
