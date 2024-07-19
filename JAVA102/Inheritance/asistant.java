package JAVA102.Inheritance;

public class asistant extends academian { // asistan

    private String officeHour;

    public asistant(String fullName, String phoneNumber, String email, String department, String rank,
            String officeHour) {

        super(fullName, phoneNumber, email, department, rank);
        this.officeHour = officeHour;
    }

    public void takeQuiz() {
        System.out.println(this.getFullName() + "  take a  " + this.getDepartment() + "  quiz .  ");

    }

    // setter and gettter for variable

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

    public String getOfficeHour() {
        return this.officeHour;
    }

}
