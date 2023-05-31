package Domen;

public class Bottle extends Product{

    private int volume;

    /**
     * @param productId индификатор продукта
     * @param name наименование
     * @param productCategory категория
     * @param price цена
     * @param volume объем
     */
    public Bottle(int productId, String name, String productCategory, Double price, int volume) throws Exception{
        super(productId, name, productCategory, price);
        this.volume = volume;
    }

    /**
     * @return возвращает объем
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume изменить объем
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume = " + volume;
    }
}
