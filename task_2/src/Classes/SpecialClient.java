package Classes;

public class SpecialClient extends Actor {
    /**
     * такой же как и ординарный клиент, имеет дополнительную переменную idVip;
     */
    protected int idVip;
    
    public SpecialClient(String name, int idVip) throws Exception{
        super(name);
        this.idVip = idVip;
    }


    @Override
    public String getName() {
        return super.name;
    }

    public void setName(String name) {
        super.name = name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setTakeOrder() {
        super.isTakeOrder =  !super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setMakeOrder() {
        super.isMakeOrder =  !super.isMakeOrder;
    }
    
    
    public int getIdVip() {
        return idVip;
    }
    
    public void setIdVip(int idVip) {
        this.idVip = idVip;
    }
    

    @Override
    public String toString() {
        return "SpecialClient [idVip= " + idVip + super.toString();
    }
}