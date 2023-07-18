package Books.CleanCode.SOLID.Service;

import Books.CleanCode.SOLID.Service.Interface.AdministratorAction;

public class AdministratorService implements AdministratorAction {


    @Override
    public void read() {
        System.out.println("Administrator starts reading");
    }

    @Override
    public void walk() {
        System.out.println("Administrator starts walking");
    }

    @Override
    public void readFast() {
        System.out.println("Administrator starts reading so fast, its all about his personality");
    }

    @Override
    public void walkLikeABoss() {
        System.out.println("Administrator starts walking so intense, its all about his drip");
    }
}
