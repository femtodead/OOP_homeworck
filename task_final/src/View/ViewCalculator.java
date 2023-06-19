package View;

import java.util.Scanner;

import Controller.iCalcComplexNumber;
import Model.ComplexNumber;

public class ViewCalculator {
    private ComplexNumber previousAction;

    public iCalcComplexNumber getPreviousAction() {
        return previousAction;
    }

    public void setPreviousAction(ComplexNumber previousAction) {
        this.previousAction = previousAction;
    }

    public ViewCalculator() {
        this.previousAction =  new ComplexNumber(0.0, 0.0);
    }

    public void run() {
        while (true) {
            iCalcComplexNumber primaryArg = promptComplexNumber("Введите первый аргумент: ");

            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, -, =) : ");
                if (cmd.equals("*")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    this.previousAction.setPreviousAction(primaryArg.multi(arg));
                    System.out.println(primaryArg.getResult());
                    continue;
                }
                if (cmd.equals("+")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    this.previousAction.setPreviousAction(primaryArg.sum(arg));
                    System.out.println(previousAction.getResult());
                    continue;
                }
                    if (cmd.equals("/")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                    previousAction.setPreviousAction(primaryArg.division(arg));
                    continue;
                }
                    if (cmd.equals("-")) {
                    ComplexNumber arg = promptComplexNumber("Введите второй аргумент: ");
                     this.previousAction.setPreviousAction(primaryArg.subtraction(arg));
                    continue;
                }
                if (cmd.equals("=")) {
                    System.out.println(previousAction.getResult());
                    String result = this.previousAction.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private ComplexNumber promptComplexNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        ComplexNumber cN = new ComplexNumber(0.0, 0.0);
        return cN.parseComplexNumber(in.nextLine());
    }
}
