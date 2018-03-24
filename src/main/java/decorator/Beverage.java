package decorator;

public abstract class Beverage {
    public String description = "I define beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
