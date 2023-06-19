package calculator;

public class Calculator implements iCalculable  {
    
    private Double primaryArg;

    public Calculator(Double primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public iCalculable sum(Double arg) {
        primaryArg += arg;
        return this;
    }

    @Override
    public iCalculable multi(Double arg) {
        primaryArg *= arg;
        return this;
    }

    @Override
    public Double getResult() {
        return primaryArg;
    }
}
