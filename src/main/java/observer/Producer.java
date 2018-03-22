package observer;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Producer implements Publisher {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private List<Subscriber> consumers;

    public Producer() {
        this.state = null;
        this.consumers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber s) {
        consumers.add(s);
    }


    public void removeSubscriber(Subscriber s) {
        int i = consumers.indexOf(s);
        if (i > 0) {
            consumers.remove(i);
        }
    }

    public void notifySubscribers() {
        for (Subscriber s: consumers) {
            s.update();
        }
    }

    public static void main(String[] args) {
        Producer producer = new Producer();

        Consumer consumer = new Consumer("C1", producer);
        producer.addSubscriber(consumer);

        consumer = new Consumer("C2", producer);
        producer.addSubscriber(consumer);

        producer.setState("PUBLISHING");

        producer.notifySubscribers();
    }
}
