package Factory;

public class CoffeeFactory {
    public ICoffee getCoffee(Coffee coffee){
        ICoffee iCoffee;
        switch(coffee){
            case ESPRESSO: iCoffee = new Espresso();
            break;
            case AMERICANO: iCoffee = new Americano();
            break;
            default: throw new IllegalArgumentException("Неверный тип кофе");
        }
        return iCoffee;
    }
}
