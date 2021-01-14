package model;

import java.util.*;

public class AppointmentNourse implements ISchedulable {

    private int id;
    private Patient patients;
    private Nourse nurse;
    private Date date;
    private String time;

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

    public Nourse getNurse() {
        return nurse;
    }

    public void setNurse(Nourse nurse) {
        this.nurse = nurse;
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
    public void schedulable(Date date, String time) {
        // TODO Auto-generated method stub

    }

}
