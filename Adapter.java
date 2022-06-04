package Adapter;

public class Adapter implements Interface {

    private final MemoryCard memoryCard;

    public Adapter(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
    }

    @Override
    public void setConnection() {
        memoryCard.setConnection();
        memoryCard.readData();
    }
}
