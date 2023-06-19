package Controller;


public class Controller {
    iGetView view;
    iCalcComplexNumber firstNumber;
    iCalcComplexNumber secondNumber;
    
    public Controller(iGetView view, iCalcComplexNumber firstNumber, iCalcComplexNumber secondNumber) {
        this.view = view;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public iGetView getView() {
        return view;
    }

    public void setView(iGetView view) {
        this.view = view;
    }

    public iCalcComplexNumber getModel() {
        return firstNumber;
    }

    public void setModel(iCalcComplexNumber model) {
        this.firstNumber = model;
    }

    
    public void run() {
        while (true) {
            String primaryArg = view.prompt("Введите первый аргумент: ");
            firstNumber.parseComplexNumber(primaryArg);
            while (true) {
                String cmd = view.prompt("Введите команду (*, +, /, -, =) : ");
                if (cmd.equals("*")) {
                    String arg = view.prompt("Введите второй аргумент: ");
                    secondNumber.parseComplexNumber(arg);
                    this.firstNumber = firstNumber.multi(secondNumber);
                    continue;
                }
                if (cmd.equals("+")) {
                    String arg = view.prompt("Введите второй аргумент: ");
                    secondNumber.parseComplexNumber(arg);
                    this.firstNumber = firstNumber.sum(secondNumber);
                    continue;
                }
                    if (cmd.equals("/")) {
                    String arg = view.prompt("Введите второй аргумент: ");
                    secondNumber.parseComplexNumber(arg);
                    this.firstNumber = firstNumber.division(secondNumber);
                    continue;
                }
                    if (cmd.equals("-")) {
                    String arg = view.prompt("Введите второй аргумент: ");
                    secondNumber.parseComplexNumber(arg);
                    this.firstNumber = firstNumber.subtraction(secondNumber);
                    continue;
                }
                if (cmd.equals("=")) {
    
                    System.out.printf("Результат %s\n", view.accept(firstNumber.getResult()));
                    break;
                }
            }
            String cmd = view.prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }
}
