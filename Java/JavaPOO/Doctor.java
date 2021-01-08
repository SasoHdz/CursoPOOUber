public class Doctor {

    static int id;
    String name;
    String speciality;
    String email;

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    //COMPORTAMIENTOS   
    public void showName(){
        System.out.println(name);
    }

}
