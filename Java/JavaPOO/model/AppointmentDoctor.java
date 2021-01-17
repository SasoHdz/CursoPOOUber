package model;

import java.util.*;
public class AppointmentDoctor implements ISchedulable{
    private int id;
    private Patient patients;
    private Doctor doctor;
    private Date date;
    private String time;

    public AppointmentDoctor(Patient patient, Doctor doctor) {
        this.patients = patient;
        this.doctor = doctor;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatients() {
        return patients;
    }

    public void setPatients(Patient patients) {
        this.patients = patients;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time + "hrs.";
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedulable(Date date, String time) {
        // TODO Auto-generated method stub
        this.date =  date;
        this.time = time;
    }
    
}
