package Domen;

public class Product {
    private int productId;
    private String Name;
    private String productCategory;
    private Double Price;

    /**
     * @param productId индификатор продукта
     * @param name наименование
     * @param productCategory категория
     * @param price цена
     */
    public Product(int productId, String name, String productCategory, Double price) {
        this.productId = productId;
        Name = name;
        this.productCategory = productCategory;
        if (price >= 10) {
            Price = price;  
        }
        else System.out.println("Ошибка: цена не может быть отрицательной");
    }


    
    
    
    
    /**
     * @return возвращает индификатор
     */
    public int getProductId() {
        return productId;
    }
    
    
    
    /**
     *  изменяет индификатор
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }
    
    
    
    /**
     * @return возвращает наименование
     */
    public String getName() {
        return Name;
    }
    

    /*
     * изменяет наименование
     */
    public void setName(String name) {
        Name = name;
    }
    
    
    
    /**
     * @return возвращает категорию
     */
    public String getProductCategory() {
        return productCategory;
    }
    
    
    
    /*
     * изменяет категорию
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
    
    
    
    /**
     * @return возвращает индификатор цену
     */
    public Double getPrice() {
        return Price;
    }
    
    
    /*
     * изменяет цену
     */
    public void setPrice(Double price) {
        Price = price;
    }
    /*
     * @return возвращает всю информацию по продукту
     */
    @Override
    public String toString() {
        return "Product : id = " + productId + ", " + " Name = " + Name + ", " + " Price = " + Price + ", " + " productCategory = " + productCategory;
    }
}
