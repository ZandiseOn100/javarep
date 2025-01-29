package exceptionHandling;

public class Car {
    private String model;
    private double fuelLevel;
    private boolean isRunning;

    public Car(String model, double fuelLevel){
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.isRunning = false;
    }
    public void start() throws FuelException{
        if (fuelLevel <= 0){
            throw new FuelException("Can't start a car with low fuel levels");
        }
        isRunning = true;
        System.out.println(model + " started successfully");
    } 
    public void drive() throws FuelException{
        if (!isRunning) {
            throw new IllegalStateException("Cannot drive the car is not started");
        }if (fuelLevel <= 0) {
            throw new FuelException("Can't drive a car with low fuel levels");
        }
        fuelLevel -= 10;
        System.out.println("Driving " + model + ". Fuel level: " + fuelLevel + "%");
    }

    public void stop(){
        isRunning = false;
        System.out.println(model + " stopped.");
    }

    public void refuel(double amount){
        fuelLevel += amount;
        if (fuelLevel > 100) {
            fuelLevel = 100;
        }
        System.out.println(model + " refueled. Fuel level: " + fuelLevel + "%");
    }
    public String getModel(){
        return model;
    }
    public double getFuelLevel(){
        return fuelLevel;
    }
    public boolean isRunning(){
        return isRunning;
    }
    @Override
    public String toString(){
        return "Details: " + model + " " + fuelLevel + " " + isRunning;
    }
}
