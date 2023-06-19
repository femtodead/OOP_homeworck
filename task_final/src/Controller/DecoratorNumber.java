package Controller;

import Model.Loger;

public class DecoratorNumber extends Loger implements iCalcComplexNumber {
    iCalcComplexNumber calc;
    Loger log;

    

    public DecoratorNumber(iCalcComplexNumber calc, Loger log) {
        this.calc = calc;
        this.log = log;
    }

    @Override
    public iCalcComplexNumber sum(iCalcComplexNumber primaryArg) {
        String ferstNumber = calc.getResult();
        String secondNumber = primaryArg.getResult();
        iCalcComplexNumber sum = calc.sum(primaryArg);
        log.write(String.format("Комментарий:  Произошла сумма двух комплексных чисел в виде %s + %s = %s", ferstNumber, secondNumber, sum.getResult()));
        return sum;
    }

    @Override
    public iCalcComplexNumber multi(iCalcComplexNumber primaryArg) {
        String ferstNumber = calc.getResult();
        String secondNumber = primaryArg.getResult();
        iCalcComplexNumber multi = calc.multi(primaryArg);
        log.write(String.format("Комментарий:  Произошло умнажение двух комплексных чисел в виде %s * %s = %s", ferstNumber, secondNumber, multi.getResult()));
        return multi;
    }

    @Override
    public iCalcComplexNumber subtraction(iCalcComplexNumber primaryArg) {
        String ferstNumber = calc.getResult();
        String secondNumber = primaryArg.getResult();
        iCalcComplexNumber subtraction = calc.subtraction(primaryArg);
        log.write(String.format("Комментарий:  Произошло вычетание двух комплексных чисел в виде %s - %s = %s", ferstNumber, secondNumber, subtraction.getResult()));
        return subtraction;
    }

    @Override
    public iCalcComplexNumber division(iCalcComplexNumber primaryArg) {
        String ferstNumber = calc.getResult();
        String secondNumber = primaryArg.getResult();
        iCalcComplexNumber division = calc.division(primaryArg);
        log.write(String.format("Комментарий:  Произошло деление двух комплексных чисел в виде %s / %s = %s", ferstNumber, secondNumber, division.getResult()));
        return division;
    }

    @Override
    public iCalcComplexNumber parseComplexNumber(String text) {
        log.write("Комментарий:  Превращаем введенную строку в комплексное число");
        return calc.parseComplexNumber(text);
    }
    @Override
    public String getResult() {
        log.write("Комментарий:  Фомируем строку в зависимости от переменных в классе комплексных чисел(1.0 или 2.0i или 0.0 или нормальная запись в виде 1.0+2.0i)");
        return calc.getResult();
    }

    public iCalcComplexNumber getCalc() {
        return calc;
    }

    public void setCalc(iCalcComplexNumber calc) {
        this.calc = calc;
    }

    public Loger getLog() {
        return log;
    }

    public void setLog(Loger log) {
        this.log = log;
    }

    
}
