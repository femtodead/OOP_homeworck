package Controller;


public interface iCalcComplexNumber {
    iCalcComplexNumber sum(iCalcComplexNumber primaryArg);
    iCalcComplexNumber multi(iCalcComplexNumber primaryArg);
    iCalcComplexNumber subtraction(iCalcComplexNumber primaryArg);
    iCalcComplexNumber division(iCalcComplexNumber primaryArg);
    String getResult();
    public  iCalcComplexNumber parseComplexNumber(String text);
}
