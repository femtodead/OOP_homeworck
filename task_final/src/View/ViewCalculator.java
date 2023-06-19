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
    
    public ViewCalculator(String previousAction, String result) {
        this.previousAction = previousAction;
        this.result = result;
    }
    
    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    @Override
    public String broadcast() {
        return this.previousAction;
    }
    @Override
    public String accept(String text) {
        this.result = text;
        return text;
    }

    public String getPreviousAction() {
        return previousAction;
    }

    public void setPreviousAction(String previousAction) {
        this.previousAction = previousAction;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
