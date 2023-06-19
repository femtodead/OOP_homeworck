package Controller;

import View.ViewCalculator;

public class Controller {
    ViewCalculator view;
    iCalcComplexNumber model;
    
    public Controller(ViewCalculator view, iCalcComplexNumber model) {
        this.view = view;
        this.model = model;
    }

    public ViewCalculator getView() {
        return view;
    }

    public void setView(ViewCalculator view) {
        this.view = view;
    }

    public iCalcComplexNumber getModel() {
        return model;
    }

    public void setModel(iCalcComplexNumber model) {
        this.model = model;
    }
}
