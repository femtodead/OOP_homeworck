package Interfaces;

import java.io.IOException;

public interface iLog {
    /**
     * запись и добавление логов
     */
    void addToLog(String text) throws SecurityException, IOException;
}
