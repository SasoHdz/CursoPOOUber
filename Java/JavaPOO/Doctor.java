import java.util.*;
public class Doctor extends User {

    private String speciality;

    public Doctor(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
        super.id++;
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
    }
}
