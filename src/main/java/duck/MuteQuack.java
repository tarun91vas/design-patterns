package duck;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("sshh silence!! no quacking");
    }
}
