public class Doctor {

    static int id;
    private String name;
    private String speciality;
    private String email;

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //COMPORTAMIENTOS   
    public void showName(){
        System.out.println(name);
    }
}
