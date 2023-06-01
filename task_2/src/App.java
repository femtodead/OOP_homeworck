

import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionalClient;
import Classes.ReturnActor;
import Classes.SpecialClient;


public class App {
    public static void main(String[] args) throws Exception {
        
        Market market = new Market();
        Actor client1 = new OrdinaryClient("Boris");
        Actor client3 = new SpecialClient("Prezident", 1);
        Actor client4 = new ReturnActor("Саша", true);
        Actor client5 = new PromotionalClient("Кирилл");
        Actor client6 = new PromotionalClient("Кирилл1");
        Actor client7 = new PromotionalClient("Кирилл2");

        market.acceptToMarket(client1);
        market.acceptToMarket(client4);
        market.acceptToMarket(client5);
        market.acceptToMarket(client6);
        market.acceptToMarket(client7);
        market.acceptToMarket(client3);
        // market.acceptToMarket(new TaxService("Tax audit"));


        market.update();
    }
}