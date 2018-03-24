package strategy;

public class DemoDuck extends Duck {

    public DemoDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a demo duck");
    }

    public static void main(String[] args) {

        // Dynamically change duck behavior
        Duck demoDuck = new DemoDuck();

        demoDuck.performFly();
        demoDuck.setFlyBehavior(new RocketFlying());
        demoDuck.performFly();
    }
}
