package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNourse> appointmentNourses = new ArrayList<>();

    
    public Patient(String name, String email)
    {
        super(name,email);
    }

    
    //Setters
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setBlood(String blood)
    {
        this.blood = blood;
    }

    //Getters

    public String getWeight()
    {
        return this.weight + "Kg";
    }

    public double getHeight()
    {
        return this.height;
    }

    public String getBlood()
    {
        return this.blood;
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nAge: " + birthday + 
            "\n Weight: " +getWeight()+ "\n Height"+getHeight()+"\nBlood"+blood;
    }

    @Override
    public void showDataUser() {
        // TODO Auto-generated method stub
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento ");
        System.out.println("Nombre:"+super.getName());
    }

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedulable(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNourse> getAppointmentNourses() {
        return appointmentNourses;
    }

    public void setAppointmentNourses(ArrayList<AppointmentNourse> appointmentNourses) {
        this.appointmentNourses = appointmentNourses;
    }
    
}
