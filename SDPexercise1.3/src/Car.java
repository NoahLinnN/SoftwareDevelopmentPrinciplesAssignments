public class Car {

    private int totalKilometers;
    private int fuel;
    private int maxFuel;
    private double efficiency;
    private String licencePlate;

    public Car(String licencePlate, int maxFuel, double efficiency) {
        setLicencePlate(licencePlate);

        if (maxFuel <= 0){
            throw new IllegalArgumentException("The car should be able to hold fuel");
        }
        if (efficiency <0){
            throw new IllegalArgumentException("Car should have efficiency");
        }
        this.maxFuel = maxFuel;
        this.efficiency = efficiency;

        this.fuel = maxFuel;
    }

    public void setLicencePlate(String licencePlate){
        if (!isValidLicencePlate(licencePlate)){
            throw new IllegalArgumentException("Not a valid licence plate");
        }
        this.licencePlate = licencePlate;
    }

    private boolean isValidLicencePlate(String licencePlate) {;
        return licencePlate.matches("\\d{3}-[A-Z]{2}-\\d");
    }

    public void drive(int kilometers){
        if (kilometers <= 0){
            throw new IllegalArgumentException("Negative km given");
        }

        double consumption = efficiency * kilometers;

        if ((fuel - consumption) < 0 ){
            throw new IllegalStateException("Not enough fuel for that");
        }
        this.fuel -= consumption;
        this.totalKilometers += kilometers;
    }

    public void refuel(int addFuel){
        if (addFuel > 0) {

        }
    }

    public int getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "The car has driven "+totalKilometers+ " kilometers. The tank currently holds "+ fuel + " liters. Efficiency: "+efficiency+ " l/km";
    }
}
