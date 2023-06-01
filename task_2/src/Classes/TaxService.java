package Classes;



public class TaxService extends Actor {
    /**
     * проверка
     */

    public TaxService(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder() {
       isMakeOrder = false;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrder = false;
    }



    @Override
    public String toString() {
        return "TaxService [" + super.toString();
    }

}
