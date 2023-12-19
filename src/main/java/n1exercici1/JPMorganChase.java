package n1exercici1;

public class JPMorganChase extends Observer {

    public JPMorganChase(Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update() {
        System.out.println("JP Morgan Chase has received the new state of stocks: " + broker.getState());
    }
}
