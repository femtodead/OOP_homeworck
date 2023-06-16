package exercise_2;

public class Car extends Vehicle{
    String type = "Car";
    public String getType() {
        return type;
    }
    public Car(int maxSpeed) {
        super(maxSpeed);
    }    
}
