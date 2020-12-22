import java.util.*;

public class UberVan extends UberBlack {
    
    public UberVan(String license, Account driver,Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial)
    {
        super(license,driver,typeCarAccepted,seatsMaterial);
    }

    @Override
    public void setPassenger(Integer passenger)
    {
        if(passenger == 6){
            this.passenger = passenger;
        }
        else
        {
            System.out.println("El valor por defecto debe ser 6");
        }
    }
}