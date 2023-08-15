package DesignPattern.Factory.Service;

import DesignPattern.Factory.Model.BeefBurger;
import DesignPattern.Factory.Model.Burger;
import DesignPattern.Factory.Model.Factory;

public class BeefBurgerFactory extends Factory {
    @Override
    protected Burger createBurger() {
        return new BeefBurger();
    }
}
