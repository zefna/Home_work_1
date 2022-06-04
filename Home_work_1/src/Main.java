import Adapter.Adapter;
import Adapter.MemoryCard;
import Adapter.USB;
import Factory.Coffee;
import Factory.CoffeeFactory;
import Factory.CoffeeMachine;
import Factory.Espresso;
import Proxy.DataBase;
import Singleton.LoggingSingleton;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LoggingSingleton logging = new LoggingSingleton();
        System.out.println("log info: " + logging);

        CoffeeFactory factory = new CoffeeFactory();
        CoffeeMachine machine = new CoffeeMachine(factory);
        machine.start(Coffee.AMERICANO);

        MemoryCard memoryCard = new MemoryCard();
        Adapter adapter = new Adapter(memoryCard);
        adapter.setConnection();

        DataBase dataBase = new DataBase();
        String myDataBase = "MyBase";
        dataBase.getDataBase(myDataBase);
    }
}
