package Adapter;

public class MemoryCard implements Interface {

    @Override
    public void setConnection() {
        System.out.println("Карта памяти вставлена!");
    }

    public void readData() {
        System.out.println("Данные с карты памяти доступны для чтения.");
    }
}
