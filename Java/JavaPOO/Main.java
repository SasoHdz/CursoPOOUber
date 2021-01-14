import static ui.UIMenu.*;
import java.util.*;

import model.Doctor;
import model.Patient;
import model.User;

public class Main {
    public static void main(String[] args) {
        
        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@anahi.com","pediatra");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);
        /*

        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */


        System.out.println();
        System.out.println();
        User patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);
    }
}

