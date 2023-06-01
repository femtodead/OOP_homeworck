package Classes;

public class PromotionalClient extends Actor {
    /**
     * @param numberPromotion количество возможных участников акции
     * @param namePromotion название акции
     */
    private static int numberPromotion;
    private static String namePromotion;

    static{
        PromotionalClient.numberPromotion = 2;
        PromotionalClient.namePromotion = "1+1";
    }
    /**
     * конструктор
     */
    public PromotionalClient(String name) {
        super(name);
    }
    /**
     * изменяет сделал ли заказ у покупатель в зависимости от условия
     */
    @Override
    public void setMakeOrder() {
        if (PromotionalClient.numberPromotion > 0) super.isMakeOrder =  !super.isMakeOrder; 
    }
    /**
     * изменяет переменную есть ли заказ у покупателя + уменьшает количечтво участников акции
     */
    @Override
    public void setTakeOrder() {
        if (PromotionalClient.numberPromotion > 0) 
        {
            super.isTakeOrder =  !super.isTakeOrder;
            PromotionalClient.numberPromotion--;
        }
    }
    /**
     * возвращает сделал ли заказ у покупатель
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**
     * возвращает есть ли заказ у покупателя
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }


    /**
     * возвращает имя покупателя
     */
    @Override
    public String getName() {
        return super.name;
    }
    /**
     * возвращает строку со всеми параметрами класса
     */
    @Override
    public String toString() {
        return "PromotionalClient( " + PromotionalClient.numberPromotion + " " + PromotionalClient.namePromotion + ") [" + super.toString();
    }


    
}
