package View;

import java.util.Scanner;

import Controller.iGetView;

public class ViewCalculator implements iGetView{
    private String previousAction;
    private String result;
    
    public ViewCalculator() {
        this.previousAction = "";
        this.result = "";
    }




    public void run() {
        while (true) {
            String primaryArg = promptComplexNumber("Введите первый аргумент: ");

            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, -, =) : ");
                if (cmd.equals("*")) {
                    String arg = promptComplexNumber("Введите второй аргумент: ");
                    this.previousAction = arg;
                    continue;
                }
                if (cmd.equals("+")) {
                    String arg = promptComplexNumber("Введите второй аргумент: ");
                    this.previousAction = arg;
                    continue;
                }
                    if (cmd.equals("/")) {
                    String arg = promptComplexNumber("Введите второй аргумент: ");
                    this.previousAction = arg;
                    continue;
                }
                    if (cmd.equals("-")) {
                    String arg = promptComplexNumber("Введите второй аргумент: ");
                    this.previousAction = arg;
                    continue;
                }
                if (cmd.equals("=")) {
                    accept(cmd);
                    System.out.printf("Результат %s\n", this.result);
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

    private String promptComplexNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public String broadcast() {
        return this.previousAction;
    }
    @Override
    public void accept(String text) {
        this.result = text;
    }
}
