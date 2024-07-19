package JAVA102.Inheritance;

public class labasistant extends asistant {
    

    public labasistant(String fullName, String phoneNumber, String email, String department, String rank,
    String officeHour){

        super(fullName, phoneNumber, email, department, rank, officeHour);

    }




    public void enteredLab(){
        System.out.println(this.getFullName() +" will enter lab.");
    }


    public void enteredLesson()
    
}
