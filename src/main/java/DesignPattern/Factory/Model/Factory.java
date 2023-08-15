package DesignPattern.Factory.Model;

import DesignPattern.Factory.Service.ChickenBurgerFactory;

public abstract class Factory {

    public Burger orderBurguer(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    protected abstract Burger createBurger();


    public static void main(String[] args) {
      Factory factory = new ChickenBurgerFactory();
      ChickenBurger chickenBurger = (ChickenBurger) factory.orderBurguer();
      chickenBurger.chickenWings = true;
    }

    /*OLD PATTERN
    public burger orderBurguer(String request) {
      Burger burger = null;
      if ("BEEF"".equals(request){
         burger = new BeefBurger();
         else if ("VEGGIE"".equals(request){
         burger = new VeggieBurger();
      }
    }

    We need make Factory class Abstract, a factory for each burger class extending this class.
    Burger interface and each type of Burger implementing it.
     */

}
