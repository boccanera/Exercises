package DesignPattern.Strategy;

public interface PaymentStrategy {

    void collectPaymentDetails();
    boolean validation();
    void pay(int amount);

}
