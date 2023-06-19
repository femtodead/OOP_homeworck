import exercise_4.Rectangle;
import exercise_4.Square;

public class App {
    public static void main(String[] args) throws Exception {
        Rectangle r1 = new Rectangle(10,9);
        Rectangle r2 = new Square(8);

        System.out.println(r1.area());
        r1.setHeight(8);
        r1.setWidth(10);
        System.out.println(r1.getHeight());
        System.out.println(r1.getWidth());
        System.out.println("-------------------------------");
        System.out.println(r2.area());
        r2.setHeight(10);
        System.out.println(r2.getHeight() +"  "+ r2.getWidth());
        r2.setWidth(5);
        System.out.println(r2.getHeight() +"  "+ r2.getWidth());
       
    }
}
