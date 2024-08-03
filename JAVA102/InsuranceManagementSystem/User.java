package InsuranceManagementSystem;

import java.util.Date;
import java.util.ArrayList;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String job;
    private int age;
    private ArrayList<Address> address;
    private Date date1;

    public User(String name, String surname, String email, String password, String job, int age,
            ArrayList<Address> address, Date date1) {
        this.address = new ArrayList<>();
        this.date1 = date1;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<Address> address) {
        this.address = address;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }

    @Override
    public String toString() {
        StringBuilder userInfo = new StringBuilder();
        userInfo.append("Name: ").append(name).append(" ").append(surname).append("\n")
                .append("Email: ").append(email).append("\n")
                .append("Job: ").append(job).append("\n")
                .append("Age: ").append(age).append("\n")
                .append("Date: ").append(date1).append("\n")
                .append("Addresses: \n");

        for (Address addr : address) {
            userInfo.append(addr.toString()).append("\n");
        }

        return userInfo.toString();
    }
}
