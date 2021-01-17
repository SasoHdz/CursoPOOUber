package ui;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;
import model.Patient;
import model.User;

public class UIMenu {

    public static final String[] MONTHS = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre" };
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu() throws ParseException {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    public static void showPatientMenu() throws ParseException {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }

    private static void authUser(int UserType) throws ParseException
    {
        //UserType = 1 Doctor
        //UserType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Isaac Hernandez","isaachr0405@gmail.com","Pediatra"));
        doctors.add(new Doctor("Alma Veronica","AlmaTV@gmail.com","Terapeuta"));
        doctors.add(new Doctor("Mariana","MariA0405@gmail.com","General"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Saso Hdz","sasoHdzRdz@gmail.com"));
        patients.add(new Patient("Juan de Dios","juanito1415@gmail.com"));
        patients.add(new Patient("Alicia Martinez","Alicia123@gmail.com"));
        
        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(UserType == 1){
                for(Doctor d: doctors){
                    if(d.getEmail().equals(email))
                    {
                        emailCorrect= true;
                        //Obtener Datos de usuario logeado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if(UserType == 2){
                for(Patient p: patients){
                    if(p.getEmail().equals(email))
                    {
                        emailCorrect= true;
                        //Obtener Datos de usuario logeado
                        patientLogged = p;
                        UIPatientMenu.showPatientMenu();
                    }
                }

            }

        }while(!emailCorrect);
        
    }

}
