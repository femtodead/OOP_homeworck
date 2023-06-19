package Controller;


public class Controller {
    iGetView view;
    iCalcComplexNumber model;
    
    public Controller(iGetView view, iCalcComplexNumber model) {
        this.view = view;
        this.model = model;
    }

    public iGetView getView() {
        return view;
    }

    public void setView(iGetView view) {
        this.view = view;
    }

    public iCalcComplexNumber getModel() {
        return model;
    }

    public void setModel(iCalcComplexNumber model) {
        this.model = model;
    }
}
