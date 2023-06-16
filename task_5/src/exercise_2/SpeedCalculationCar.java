package exercise_2;

public class SpeedCalculationCar implements iSpeedCalculation{

    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * 0.8;
    }
    
}
