package iterator;

import java.util.Iterator;

public class Client {
    DataStructure array;
    DataStructure map;

    public Client(DataStructure a, DataStructure b) {
        this.array = a;
        this.map = b;
    }

    public void printValues(DataStructure ds) {
        Iterator it = ds.createIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
        DataStructure a = new ArrayDS();
        DataStructure b = new MapDS();
        Client client = new Client(a, b);

        client.printValues(a);
        client.printValues(b);
    }

}
