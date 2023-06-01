package Classes;

public class ReturnActor extends Actor{
    /**
     * такой же как и ординарный клиент, только приходит в магазин уже с заказом isTakeOrder=true
     */
    public ReturnActor(String name, boolean isTakeOrder) {
        super(name, isTakeOrder);
    }

    @Override
    public void setMakeOrder() {
        super.isMakeOrder =  !super.isMakeOrder;
    }

    @Override
    public void setTakeOrder() {
        super.isTakeOrder =  !super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }



    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String toString() {
        return "ReturnActor " + super.toString();
    }
    
}
