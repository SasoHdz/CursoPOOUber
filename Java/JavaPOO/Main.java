import static ui.UIMenu.*;

import java.text.ParseException;
import java.util.*;

import model.Doctor;
import model.Patient;
import model.User;

public class Main {
    public static void main(String[] args) {
        try {
            showMenu();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

