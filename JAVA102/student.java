package JAVA102;

import java.util.Scanner;

public class student {
    private String name;
    private String surname;
    private int ID;
    private String address;
    private int note;
    private course c1;

    public student(String name, String surname, int ID, int note, String address) {

        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.address = address;
        this.note = note;

    }

    public void shows() {
        System.out.println("\nNAME:" + this.getName() + "\nSURNAME : " + this.getSurname() + "\nID : " + this.getID()
                + "\nNOTE : " + this.getNote() + "\nADDRESS : " + this.getAddress());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setID(int ID) {
        this.ID = ID;

    }

    public int getID() {
        return this.ID;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setNote(int note) {
        if (note >= 0 && note <= 100) {
            this.note = note;
        }
        this.note = 0;
    }

    public int getNote() {
        return this.note;
    }

    /**
     * @return course return the c1
     */
    public course getC1() {
        return c1;
    }

    /**
     * @param c1 the c1 to set
     */
    public void setC1(course c1) {
        this.c1 = c1;
    }

}
