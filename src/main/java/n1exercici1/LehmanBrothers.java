package n1exercici1;

public class LehmanBrothers extends Observer {

    public LehmanBrothers(Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Lehman Brothers has received the new state of stocks: " + broker.getState());
    }
}
