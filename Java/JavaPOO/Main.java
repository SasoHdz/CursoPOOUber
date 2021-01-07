import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        
        Doctor doctor = new Doctor();
        doctor = new Doctor("Juan de Dios","Pediatra");
        doctor.showName();
        System.out.println(doctor.id);

        Doctor myDoctor = new Doctor();
        myDoctor = new Doctor("Alma Veronica","Cirujadana");
        myDoctor.showName();
        System.out.println(myDoctor.id);
    }
}
