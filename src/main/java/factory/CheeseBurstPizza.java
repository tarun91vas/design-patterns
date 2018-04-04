package factory;

public class CheeseBurstPizza extends Pizza {
    public CheeseBurstPizza(String name) {
        super(name);
    }

    public void preparePizza(){
        System.out.println("Preparing cheese burst");
    };
    public void boxPizza() {
        System.out.println("Packing cheese burst");
    };
    public void deliverPizza() {
        System.out.println("Shipping cheese burst");
    };
}
