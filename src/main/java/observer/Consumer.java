package observer;

public class Consumer implements Subscriber {

    private String name;

    private Producer p;

    public Consumer(String name, Producer p) {
        this.name = name;
        this.p = p;
    }

    public void update() {
        String state = p.getState();
        System.out.println(name + " received state: " + state);
    }
}
