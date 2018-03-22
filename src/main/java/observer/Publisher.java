package observer;

public interface Publisher {
    void addSubscriber(Subscriber s);
    void removeSubscriber(Subscriber s);
    void notifySubscribers();
}
