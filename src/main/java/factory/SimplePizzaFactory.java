package factory;

public class SimplePizzaFactory {
    Pizza pizza;

    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("thincrust")) {
            this.pizza = new ThinCrustPizza("thinCrust");
        } else {
            this.pizza = new CheeseBurstPizza("cheese");
        }
        return pizza;
    }

}
