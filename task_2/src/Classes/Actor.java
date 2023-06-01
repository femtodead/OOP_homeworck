package Classes;

import Interfaces.iActorBehaviour;

public abstract class  Actor implements iActorBehaviour{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * @param name имя
     * @param isTakeOrder наличие заказа
     * @param isMakeOrder сделал заказ, всегда false 
     */
    public Actor(String name, boolean isTakeOrder){
        this.name = name;
        this.isTakeOrder = isTakeOrder;
        this.isMakeOrder = false;
    }

    public Actor(String name){
        this(name, false);
    }

    /**
     * @return имя актора
     */
    abstract public String getName();

    @Override
    public String toString() {
        return " name=" + name + ", isTakeOrder=" + isTakeOrder + ", isMakeOrder=" + isMakeOrder + "]";
    }
}
