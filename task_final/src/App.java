

import java.lang.reflect.Array;
import java.util.ArrayList;

import Controller.Controller;
import Controller.iCalcComplexNumber;
import Model.ComplexNumber;
import View.ViewCalculator;
import calculator.CalcDecorator;
import calculator.Calculator;
import calculator.Logger;
import calculator.iCalculable;

public class App {
    public static void main(String[] args) throws Exception {
        // //iCalculable calculator = new Calculator(0.0);
        // iCalculable calculator = new CalcDecorator(new Calculator(0.0),new Logger());
        // ViewCalculator view = new ViewCalculator(calculator);
        // view.run();
        
        //         String num = "10-20i";
        //         char[] ch = num.toCharArray();
        //         ArrayList<String> ar = new ArrayList<>();
        //         String temp = "";      
        //         for (int i = 0; i < ch.length; i++) {
            //             if((Character)ch[i] == (Character)'-' || (Character)ch[i] == (Character)'+' || (Character)ch[i] == (Character)'i')
            //             {
                
                //                 if((Character)ch[i] == (Character)'-' && i == 0)
                //                 {
                    //                     temp += (Character)ch[i];
//                 }
//                 if((Character)ch[i] == (Character)'-' && !(i == 0))
//                 {
    //                     ar.add(temp);
    //                     temp = "-";
    //                 }
    //                 if (i == ch.length-1 )
    //                 {
        //                     ar.add(temp);
        //                 }
        //                 if ((Character)ch[i] == (Character)'+')
        //                 {
            //                    ar.add(temp);
            //                    temp = ""; 
            //                 }
            //             }
            //             else
            //             {
                //                 temp += (Character)ch[i];
                //             }
                //         }
                //         System.out.println(ar.toString());
                
                
                
                //  ViewCalculator calculator = new ViewCalculator(); 
                // iCalculable calculator = new CalcDecorator(new Calculator(0.0),new Logger());
                // ViewCalculator view = new ViewCalculator(calculator);
                // calculator.run();
                // iCalcComplexNumber com1 = new  ComplexNumber(3.0, 1.0);
                // iCalcComplexNumber com2 = new  ComplexNumber(4.0, 2.0);
                // iCalcComplexNumber com3 = new  ComplexNumber(0.0, 2.0);
                // iCalcComplexNumber com4 = new  ComplexNumber(4.0, 0.0);
                // iCalcComplexNumber com5 = new  ComplexNumber(0.0, 0.0);
                // iCalcComplexNumber com6 = new CalculatorN(com3);

                // System.out.println((com6.sum(new  ComplexNumber(4.0, 2.0))).getResult());
                // System.out.println(com1.sum((ComplexNumber) com2).getResult()); // 7+3i
                // System.out.println(com1.subtraction((ComplexNumber) com2).getResult()); // -1-i
                // System.out.println(com1.multi((ComplexNumber) com2).getResult());// 10+10i
                // System.out.println(com1.division((ComplexNumber) com2).getResult());// 0.7-0.1i
                // System.out.println(com3.getResult());
                // System.out.println(com4.getResult());
                // System.out.println(com5.getResult());

                Controller calc = new Controller(new ViewCalculator(), new ComplexNumber());
                calc.getView().run();                
            }
        }