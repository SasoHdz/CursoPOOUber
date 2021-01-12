package model;

public class Nourse extends User {
    
    private String speciality;

    public Nourse(String name, String email) {
       super(name,email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

}
