package DesignPattern.Factory;

public abstract class Restaurant {

    public Burger orderBurguer(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    protected abstract Burger createBurger();

}
