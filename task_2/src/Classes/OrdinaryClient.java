package Classes;

public class OrdinaryClient extends Actor {
    
    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    /**
     * @param name изменить имя
     */
    public void setName(String name) {
        super.name = name;
    }
    /**
     * возвращает есть ли заказ у покупателя
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /**
     * изменяет переменную есть ли заказ у покупателя
     */
    public void setTakeOrder() {
        super.isTakeOrder = !super.isTakeOrder;
    }
    /**
     * возвращает сделал ли заказ у покупатель
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**
     * изменяет сделал ли заказ у покупатель
     */
    public void setMakeOrder() {
        super.isMakeOrder = !super.isMakeOrder;
    }
    
    /**
     * возвращает строку со всеми параметрами класса
     */
    @Override
    public String toString() {
        return  "OrdinaryClient [" + super.toString();
    }

}
