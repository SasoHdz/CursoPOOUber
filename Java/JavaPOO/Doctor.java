public class Doctor {

    int id;
    String name;
    String speciality;

    public Doctor(int id, String name, String speciality) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }

    //COMPORTAMIENTOS   
    public void showName(){
        System.out.println(name);
    }

}
