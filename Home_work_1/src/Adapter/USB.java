package Adapter;

public class USB implements Interface{
    @Override
    public void setConnection() {
        System.out.println("USB подключен!");
    }
}
