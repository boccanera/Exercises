package DesignPattern.Strategy;

public class PaypalPayment implements PaymentStrategy {

    @Override
    public void collectPaymentDetails() {

    }

    @Override
    public boolean validation() {
        return false;
    }

    @Override
    public void pay(int amount) {

    }

}
