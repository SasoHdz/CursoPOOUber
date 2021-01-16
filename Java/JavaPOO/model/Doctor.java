package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Doctor extends User {

    private String speciality;

    public Doctor(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    public void addAvailableAppointment(String date, String time) throws ParseException {

        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> gAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable" + availableAppointments.toString();
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) throws ParseException {
           try {
            this.date = format.parse(date);
           } catch(ParseException e){
               e.printStackTrace();
           }
            this.time = time;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate(){
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
        
        @Override
        public String toString () {
          return   "Available Appointments \nDate: "+date+"\nTime: "+time;
        } 
    }

    @Override
    public void showDataUser() {
        // TODO Auto-generated method stub
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Cancerología");
    }
}
