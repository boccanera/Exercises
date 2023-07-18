package DesignPattern.Factory;

public class ChickenBurgerRestaurant extends Restaurant{

    @Override
    protected Burger createBurger() {
        return new ChickenBurger();
    }
}
