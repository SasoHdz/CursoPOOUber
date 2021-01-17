package ui;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import model.Doctor;

public class UIPatientMenu {

    public static void showPatientMenu() throws ParseException {
        int response = 0;
        do{

            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            
            switch(response)
            {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointments();
                    break;
                case 0: 
                UIMenu.showMenu();
                    break;    
            }


        }while(response!=0);
    }

    private static void showBookAppointmentMenu() throws ParseException
    {
        int response = 0;
        do{
            System.out.println("::Book an appointment");
            System.out.println(":: Select date: "); 
            //Numeracion de la lista de fechas
            //Indice de la fecha seleccionada
            //doctor1
                //-1 fecha1
                //-2 fecha2
            //doctor2
            Map<Integer,Map<Integer,Doctor>> doctors = new TreeMap<>();
            int k =0;
            for(int i=0;i< UIDoctorMenu.doctorAvailableAppointments.size();i++){
                ArrayList<Doctor.AvailableAppointment> availableAppointments 
                    = UIDoctorMenu.doctorAvailableAppointments.get(i).gAvailableAppointments();
                
                Map<Integer,Doctor> doctorAppointments = new TreeMap<>();

                for(int j = 0; j < availableAppointments.size(); j++)
                {
                    k++;
                    System.out.println(k + ". " +  availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorAvailableAppointments.get(i));
                    
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                    
                }
             }
             Scanner sc = new Scanner(System.in);
             int responseDateSelected = Integer.valueOf(sc.nextLine());
             Map<Integer,Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
             Integer indexDate = 0;
             Doctor doctorSelected =  new Doctor("","","");

             for(Map.Entry<Integer,Doctor> doc :doctorAvailableSelected.entrySet()){
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
             }

             System.out.println(doctorSelected.getName()+
             ". Date: "+  
             doctorSelected.gAvailableAppointments().get(indexDate).getDate()+
             ". Time: "+ 
             doctorSelected.gAvailableAppointments().get(indexDate).getTime());
             
             System.out.println("Confirm your appoinment: \n1. Yes \n2. Change Data");
             response = Integer.valueOf(sc.nextLine());

             if(response == 1){
                 UIMenu.patientLogged.addAppointmentDoctors(
                     doctorSelected,
                     doctorSelected.gAvailableAppointments().get(indexDate).getDate(null),
                     doctorSelected.gAvailableAppointments().get(indexDate).getTime());
                
                showPatientMenu();
             }

        }while(response!=0);
    }
    
    private static void showPatientMyAppointments(){
        int response = 0;
        do{
            System.out.println(":: My Appointments");
            if(UIMenu.patientLogged.getAppointmentDoctors().size() == 0){
                System.out.println("Don't have appointments");
                break;
            }

            for(int i=0;i<UIMenu.patientLogged.getAppointmentDoctors().size();i++){
                int j = i +1;
                System.out.println(j + ". "+ 
                "Date: "+ UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() 
                + "Time: "+ UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime()
                +"\n Doctor: "+ UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
            }

            System.out.println("0. Return");
        }while(response!=0);
    }
}
