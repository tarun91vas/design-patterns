package duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a mallard duck");
    }

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performFly();
        mallard.performQuack();
    }
}
