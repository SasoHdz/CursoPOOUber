<<<<<<< HEAD
class Car
{
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;        
    }


    void printDataCar() {
        System.out.println("License: "+ license+ "Driver: "+driver);
    }
=======
class Car
{
    Integer id;
    String license;
    String driver;
    Integer passenger;

    void printDataCar()
    {
        System.out.println("Car License: "+ license + "Driver: "+ driver);
    }
>>>>>>> 9b1459aa54fce176948b527f8ba81ee9def776e7
}