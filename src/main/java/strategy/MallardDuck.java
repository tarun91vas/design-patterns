package strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a mallard duck");
    }

    public static void main(String[] args) {

        // Program to supertype and not concrete implementation
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();
    }
}
