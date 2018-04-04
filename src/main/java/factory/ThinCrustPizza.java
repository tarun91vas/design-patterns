package factory;

public class ThinCrustPizza extends Pizza {

    public ThinCrustPizza(String name) {
        super(name);
    }

    public void preparePizza(){
        System.out.println("Preparing thin crust");
    };
    public void boxPizza() {
        System.out.println("Packing thin crust");
    };
    public void deliverPizza() {
        System.out.println("Shipping thin crust");
    };
}
