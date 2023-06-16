package exercise_4;

public class Square extends Rectangle {
    
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setHeight(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public void setWidth(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }
    
}
