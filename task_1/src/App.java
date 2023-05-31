import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product item1 = new Bottle(0, "Papsi", "Water", 100.00, 500);
        Product item2 = new Product(1, "Mars", "Snec", 50.00);
        System.out.println(item1.toString());
        System.out.println(item2.toString());
        VendingMachine my_vending = new VendingMachine(50);
        my_vending.addProduct(item1);
        my_vending.addProduct(item2);
        System.out.println("------------------");
        System.out.println(my_vending.toString());
        HotDrink item3 = new HotDrink(2, "Tee", "HotDrink", 105.00, 500, 40);
        HotDrink item4 = new HotDrink(3, "coffee", "HotDrink", 200.00, 250, 40);
        item3.setTemperature(60);
        item4.setTemperature(80);
        System.out.println(item4.getTemperature());
        my_vending.addProduct(item3);
        my_vending.addProduct(item4);
        System.out.println("------------------");
        System.out.println(my_vending.toString());

    }
}
