package factory;

public abstract class Pizza {
    public String name;

    public Pizza(String name) {
        this.name = name;
    }

    public abstract void preparePizza();
    public abstract void boxPizza();
    public abstract void deliverPizza();
}
