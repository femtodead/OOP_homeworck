package Interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

import Classes.Actor;

public interface iMarketBehaviour {
    void acceptToMarket(Actor actor) throws FileNotFoundException, SecurityException, IOException;
    void releaseFromMarket(Actor list);
    void update();  
} 