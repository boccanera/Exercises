package DesignPattern.Strategy;

public class PaymentService {

    private int cost;
    private boolean includeDelivery;
    private PaymentStrategy strategy;

    public void processOrder(){
        strategy.collectPaymentDetails();
        if (strategy.validation()){
            strategy.pay(getTotal());
        }
    }

    private int getTotal(){
        return includeDelivery ? cost + 10 : cost;
    }

    public void setStrategy(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setStrategy(new CreditCardPayment());
        paymentService.processOrder();
    }

}
