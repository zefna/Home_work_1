package Factory;

public class CoffeeMachine {
    private final CoffeeFactory coffeeFactory;
    public CoffeeMachine(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public void start(Coffee coffee){
        System.out.println("Приготовление кофе началось");
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        ICoffee iCoffee = coffeeFactory.getCoffee(coffee);
        boiling();
        setVolume(iCoffee.getCoffeeVolume());
    }

    private void boiling(){
        System.out.println("Начался нагрев воды");
    }

    private void setVolume(int volume){
        System.out.println("Объём выбранного кофе: " + volume);
    }
}
