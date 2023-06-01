package Classes;




import java.io.IOException;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

import Interfaces.iLog;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

public class Market implements iMarketBehaviour,iQueueBehaviour, iLog {

    private Deque<Actor> queue;
    private ArrayList<Actor> market;
    private static Logger log = Logger.getLogger( Market.class.getName());
    Handler file;


    public Market() throws SecurityException, IOException {
        this.queue = new LinkedList<Actor>();
        this.market = new ArrayList<Actor>();
        file = new FileHandler("log.txt");
    }

    @Override
    public void acceptToMarket(Actor actor) throws SecurityException, IOException {
        this.market.add(actor);
        addToLog(actor.toString() +" клиент пришел в магазин ");
        System.out.println(actor +" клиент пришел в магазин ");
        takeInQueue(actor);
    }
    
    @Override
    public void takeInQueue(Actor actor) {
        if (actor instanceof SpecialClient) this.queue.addFirst(actor);
        else this.queue.addLast(actor);
        addToLog(actor +" клиент добавлен в очередь ");
        System.out.println(actor +" клиент добавлен в очередь ");
    }
    
    @Override
    public void takeOrder() {
        this.queue.peek().setMakeOrder();
        addToLog(this.queue.peek()+" клиент сделал заказ ");
        System.out.println(this.queue.peek()+" клиент сделал заказ ");
    }  
    
    @Override
    public void giveOrder() {
        this.queue.peek().setTakeOrder();
        addToLog(this.queue.peek() +" клиент получил свой заказ ");
        System.out.println(this.queue.peek() +" клиент получил свой заказ ");
    }
    
    @Override
    public void releaseFromQueue() {
            addToLog(this.queue.peek()+" клиент ушел из очереди ");
            System.out.println(this.queue.peek()+" клиент ушел из очереди ");  
            releaseFromMarket(this.queue.poll());
    }
    @Override
    public void releaseFromMarket(Actor actors) {
            this.market.remove(actors);
            addToLog(actors+" клиент ушел из магазина ");
            System.out.println(actors+" клиент ушел из магазина ");        
    }

    @Override
    public void update() {
        while (this.queue.size() > 0) {
            takeOrder();
            giveOrder();
            releaseFromQueue(); 
        }
    }

    @Override
    public void addToLog(String text) {
        Market.log.setUseParentHandlers(false);
        Market.log.addHandler(this.file);
        log.info(text);
    }





}
