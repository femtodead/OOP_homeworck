package Domen;

public class HotDrink extends Product{

    private int temperature;
    private int volume;

    /**
     * @param productId индификатор продукта
     * @param name наименование
     * @param productCategory категория
     * @param price цена
     * @param volume объем
     * @param temperature температура
     */
    public HotDrink(int productId, String name, String productCategory, Double price, int volume, int temperature) throws Exception {
        super(productId, name, productCategory, price);
        this.temperature = temperature;
    }

    /**
     * @return возвращает температуру
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * @param temperature изменить температуру
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
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
        return super.toString() + ", volume=" + volume + ", temperature=" + temperature;
    }
    

}
