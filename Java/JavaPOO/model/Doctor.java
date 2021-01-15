package model;

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

    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> gAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable" + availableAppointments.toString();
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public Date getDate() {
            return date;
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