class Main{
    public static void main(String[] args) {
        System.out.println("Hola Saso");
        Car car = new Car("AMW123",new Account("Juan Marcos","AND123"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("AWN234", new Account("Marina Martinez", "AND452"));
        
    }
}