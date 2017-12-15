package patterns.state;

import patterns.factories.doodlers.Doodler;

public class LockedState extends DoodlerState {

    public LockedState(Doodler doodler) {
        super(doodler);
    }

    @Override
    public void onLock() {
        doodler.changeState(new ShootingState(doodler));
        System.out.println("Lock state Shooting.");
    }

    @Override
    public void onShoot() {
        System.out.println("Do nothing.");
    }
}
