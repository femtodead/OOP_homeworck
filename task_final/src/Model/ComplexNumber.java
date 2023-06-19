package Model;

import java.util.ArrayList;


import Controller.iCalcComplexNumber;

public class ComplexNumber implements iCalcComplexNumber {
    Double real;
    Double imaginary;
    public ComplexNumber(Double real, Double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
        public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }
    public Double getReal() {
        return real;
    }
    public void setReal(Double real) {
        this.real = real;
    }
    public Double getImaginary() {
        return imaginary;
    }
    public void setImaginary(Double imaginary) {
        this.imaginary = imaginary;
    }


    public  ComplexNumber parseComplexNumber(String text) {
        ArrayList<String> ar = new ArrayList<>();
        if(!text.endsWith("i"))
        {
            try {
                System.out.println(ar.toString());
                this.real = Double.parseDouble(text);
                this.imaginary = 0.0;
                return this; // так как формат комплексного числа строго типизирован проверяем последний элемент строки и если он не раван i значит все что написано до него это число
            } catch (Exception e) {
                System.out.println("Некорректный ввод" + '\n' + "Ошибка:" + e.getMessage());
            }
        }
        else
        {
        char[] ch = text.toCharArray();
        String temp = "";      
        for (int i = 0; i < ch.length; i++) {
            if((Character)ch[i] == (Character)'-' || (Character)ch[i] == (Character)'+' || (Character)ch[i] == (Character)'i')
            {

                if((Character)ch[i] == (Character)'-' && i == 0)
                {
                    temp += (Character)ch[i];
                }
                if((Character)ch[i] == (Character)'-' && !(i == 0))
                {
                    ar.add(temp);
                    temp = "-";
                }
                if (i == ch.length-1 )
                {
                    ar.add(temp);
                }
                if ((Character)ch[i] == (Character)'+')
                {
                   ar.add(temp);
                   temp = ""; 
                }
            }
            else
            {
                temp += (Character)ch[i];
            }
        }
        } 
        if(ar.size() == 1)
        {
            this.real = 0.0;
            this.imaginary = Double.parseDouble(ar.get(0));
            return this;
        } 
        this.real = Double.parseDouble(ar.get(0));
        this.imaginary = Double.parseDouble(ar.get(1));        
        return this;
    }



    @Override
    public iCalcComplexNumber sum(iCalcComplexNumber primaryArg) {
        ComplexNumber temp = new ComplexNumber();
        temp.parseComplexNumber(primaryArg.getResult());
        Double a = this.real;
        Double b = temp.getReal();
        Double c = this.imaginary;
        Double d = temp.getImaginary();
        iCalcComplexNumber result = new ComplexNumber(a+b, c+d);
        return result;
    }
    @Override
    public iCalcComplexNumber multi(iCalcComplexNumber primaryArg) {
        ComplexNumber temp = new ComplexNumber();
        temp.parseComplexNumber(primaryArg.getResult());
        Double a = this.real;
        Double b = temp.getReal();
        Double c = this.imaginary;
        Double d = temp.getImaginary();
        iCalcComplexNumber result = new ComplexNumber(a*b-c*d, b*c + a*d);
        return result;
    }
    @Override
    public iCalcComplexNumber subtraction(iCalcComplexNumber primaryArg) {
        ComplexNumber temp = new ComplexNumber();
        temp.parseComplexNumber(primaryArg.getResult());
        Double a = this.real;
        Double b = temp.getReal();
        Double c = this.imaginary;
        Double d = temp.getImaginary();
        iCalcComplexNumber result = new ComplexNumber(a-b, c-d);
        return result;
    }
    @Override
    public iCalcComplexNumber division(iCalcComplexNumber primaryArg) {
        ComplexNumber temp = new ComplexNumber();
        temp.parseComplexNumber(primaryArg.getResult());
        Double a = this.real;
        Double b = temp.getReal();
        Double c = this.imaginary;
        Double d = temp.getImaginary();
        ComplexNumber result = new ComplexNumber((a*b+c*d)/(b*b+d*d), (c*b - a*d)/(b*b+d*d));
        return result;
    }
    @Override
    public String getResult() {
        if (imaginary != 0.0 && real !=0.0)
        {
            if (imaginary > 0.0)
            {
                return real+"+"+imaginary+"i";
            }
            if (imaginary < 0.0)
            {
                return real.toString()+imaginary.toString()+"i";
            }
        }
        else
        {
            if(imaginary == 0.0 && real == 0.0)
            {
                return "0.0";
            }
            if(imaginary == 0.0)
            {
                return real.toString();
            }
        }
        return imaginary.toString() + "i";
    }
}
