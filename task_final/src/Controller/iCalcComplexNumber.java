package Controller;

import Model.ComplexNumber;

public interface iCalcComplexNumber {
    iCalcComplexNumber sum(ComplexNumber primaryArg);
    iCalcComplexNumber multi(ComplexNumber primaryArg);
    iCalcComplexNumber subtraction(ComplexNumber primaryArg);
    iCalcComplexNumber division(ComplexNumber primaryArg);
    String getResult();
}
