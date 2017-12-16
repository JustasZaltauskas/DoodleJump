/*
* NullControl class used for Null Object pattern.
* Description: Avoids null object usage.
*
* Author: Justas Žaltauskas
 */

package patterns.factories.unitControl;

import javafx.scene.input.KeyCode;
import patterns.factories.Unit;

public class NullControl implements UnitControl {
    UnitControl next;

    @Override
    public void setMoveNext(UnitControl next) {
        this.next = next;
    }

    @Override
    public void move(Unit unit, double velocity, KeyCode keyCode) {
    }
}
