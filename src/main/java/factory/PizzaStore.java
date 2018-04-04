package factory;

public class PizzaStore {
    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = pizzaFactory.createPizza(type);

        pizza.preparePizza();
        pizza.boxPizza();
        pizza.deliverPizza();

        return pizza;
    }

    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        pizzaStore.orderPizza("abc");
    }
}
