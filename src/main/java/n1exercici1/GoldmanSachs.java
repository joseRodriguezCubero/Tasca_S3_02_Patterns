package n1exercici1;

public class GoldmanSachs extends Observer {


    public GoldmanSachs(Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Goldman Sachs has received the new state of stocks" + broker.getState());
    }
}
