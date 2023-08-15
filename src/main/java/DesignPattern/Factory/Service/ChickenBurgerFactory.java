package DesignPattern.Factory.Service;

import DesignPattern.Factory.Model.Burger;
import DesignPattern.Factory.Model.ChickenBurger;
import DesignPattern.Factory.Model.Factory;

public class ChickenBurgerFactory extends Factory {

    @Override
    protected Burger createBurger() {
        return new ChickenBurger();
    }
}
