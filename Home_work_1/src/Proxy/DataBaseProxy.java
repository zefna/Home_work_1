package Proxy;

import java.io.IOException;

public class DataBaseProxy implements LocalhostReader {

    private final DataBase dataBase;

    private final String cache;

    public DataBaseProxy(DataBase dataBase, String cache) {
        this.dataBase = dataBase;
        this.cache = cache;
    }

    @Override
    public String getDataBase(String DataBase) throws IOException {
        if(!cache.contains(DataBase)){
            String s = dataBase.getDataBase(DataBase);
            return s;
        } else {
            System.out.println("Читаем адрес базы данных из кеша");
            return cache;
        }
    }
}
