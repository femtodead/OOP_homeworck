package calculator;

public class CalcDecorator implements iCalculable {
    private iCalculable oldCalc;
    private Logger logger;
    public CalcDecorator(iCalculable oldCalc, Logger log) {
        this.oldCalc = oldCalc;
        this.logger = log;
    }

     @Override
    public iCalculable sum(Double arg) {
        Double firstArg = oldCalc.getResult();
        
        logger.log(String.format("Первое значение калькулятора %f. Начало вызова метода sum с параметром %f", firstArg, arg));
        iCalculable result = oldCalc.sum(arg);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    @Override
    public iCalculable multi(Double arg) {
        Double firstArg = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %f. Начало вызова метода multi с параметром %f", firstArg, arg));
        iCalculable result = oldCalc.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public Double getResult() {
        Double result = oldCalc.getResult();
        logger.log(String.format("Получение результата %f", result));
        return result;
    }
}
