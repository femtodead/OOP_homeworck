package exercise_2;

public class Bus extends Vehicle{
    String type = "Bus";
    public String getType() {
        return type;
    }
    public Bus(int maxSpeed) {
        super(maxSpeed);
    }
}
