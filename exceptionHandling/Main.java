package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 50);
        try {
            myCar.start();
            myCar.drive();
            myCar.drive();
            myCar.drive();
            myCar.drive();
            myCar.drive();
            myCar.drive();
        } catch (Exception e) {
            System.err.println("FuelException: " + e.getMessage());
        }finally{
            myCar.stop();
            System.out.println("Thanks for riding with " + myCar.getModel());
        }
    }
}
