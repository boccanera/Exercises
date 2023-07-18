package Books.CleanCode.SOLID.Service;

import Books.CleanCode.SOLID.Service.Interface.AssociateAction;

public class AssociateService implements AssociateAction {

    @Override
    public void read() {
        System.out.println("Associate starts reading");
    }

    @Override
    public void walk() {
        System.out.println("Associate starts walking");
    }

    @Override
    public void readCalmy() {
        System.out.println("Associate reads so cute.");
    }

    @Override
    public void walkCalmy() {
        System.out.println("Associate walks so smooth.");
    }
}
