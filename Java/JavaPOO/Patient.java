public class Patient extends User {

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email)
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
    
}
