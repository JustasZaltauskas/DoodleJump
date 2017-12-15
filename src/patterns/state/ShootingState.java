package patterns.state;

import patterns.factories.doodlers.Doodler;

public class ShootingState extends DoodlerState {

    public ShootingState(Doodler doodler) {
        super(doodler);
    }


    @Override
    public void onLock() {
        doodler.changeState(new LockedState(doodler));
        System.out.println("Lock state Shooting.");
    }

    @Override
    public void onShoot() {
        doodler.startShooting();
    }
}
