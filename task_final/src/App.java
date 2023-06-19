import Controller.Controller;
import Controller.DecoratorNumber;
import Model.ComplexNumber;
import Model.Loger;
import View.ViewCalculator;


public class App {
    public static void main(String[] args) throws Exception {
                // Controller calc = new Controller(new ViewCalculator(), new ComplexNumber(), new ComplexNumber());
                // calc.run();
                Controller calc = new Controller(new ViewCalculator(), new DecoratorNumber(new ComplexNumber(), new Loger()), new DecoratorNumber(new ComplexNumber(), new Loger()));
                calc.run();                
            }
        }