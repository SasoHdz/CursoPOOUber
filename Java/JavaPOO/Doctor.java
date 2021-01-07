public class Doctor {

    static int id;
    String name;
    String speciality;

    public Doctor(){
        id++;
    }

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    //COMPORTAMIENTOS   
    public void showName(){
        System.out.println(name);
    }

}
