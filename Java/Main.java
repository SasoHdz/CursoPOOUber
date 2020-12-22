class Main{
    public static void main(String[] args) {
        System.out.println("Hola Saso");
        UberX uberX = new UberX("ADE234", new Account("Arely Vega","DES234"),"Chevrolet","Spark");
        uberX.setPassenger(4);
        uberX.printDataCar();

    }
}