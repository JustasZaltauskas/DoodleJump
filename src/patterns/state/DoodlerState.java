/*
* DoodlerState class.
* Description: Doodler state class, common interface for all states.
*
* Author: Mantvydas Zakarevičius
 */

package patterns.state;

import patterns.factories.doodlers.Doodler;

public abstract class DoodlerState {
    protected Doodler doodler;

    public DoodlerState(Doodler doodler) {
        this.doodler = doodler;
    }

    public abstract void onLock();
    public abstract void onShoot();
}
