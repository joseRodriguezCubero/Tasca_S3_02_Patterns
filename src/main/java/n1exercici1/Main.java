package n1exercici1;

public class Main {
    public static void main(String[] args) {

        Broker broker = new Broker();

        new GoldmanSachs(broker);
        new JPMorganChase(broker);
        new LehmanBrothers(broker);

        System.out.println("First state change: 15");
        broker.setState(15);
        System.out.println("Second state change: 10");
        broker.setState(10);
    }
}

