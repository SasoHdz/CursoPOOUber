public class Patient {

    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email)
    {
        this.name = name;
        this.email = email;
    }

    
    //Setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setWeight(double height)
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

    public String getName()
    {
        return this.name;
    }

    public double getWeight()
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
    
}
