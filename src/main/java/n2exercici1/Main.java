package n2exercici1;

public class Main {
    public static void main(String[] args) {

        var payment = new CreditCard();
        //var payment2 = new DebitCard();
        //var payment3 = new Paypal();

        payment.executeWith(() -> System.out.println("I'm done now.")); //TODO hacer un método random para demostrar que el callback se ejecuta despues de hacer este método.

    }
}
