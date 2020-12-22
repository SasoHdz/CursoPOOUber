
public class Car{
    Integer id;
    String license;
    Account driver;
    protected Integer passenger;

    public  Car(String license, Account driver)
    {
        this.license = license;
        this.driver = driver;
    }
   
    public Integer getPassenger()
    {
        return passenger;
    }

    public void setPassenger(Integer passenger)
    {
        if(passenger == 4){
            this.passenger = passenger;
        }
        else
        {
            System.out.println("El valor por defecto debe ser 4");
        }
    }

    void printDataCar()
    {
        if(passenger!=null)
        {
            System.out.println("Car License: "+ license + "Name Driver: "+ driver.name);
        }
        
    }
}