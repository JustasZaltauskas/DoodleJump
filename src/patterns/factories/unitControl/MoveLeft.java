/*
* MoveLeft class used for Chain Of Responsibility pattern.
* Description: Used by GameManager to control units movement.
*
* Author: Justas Žaltauskas
 */

package patterns.factories.unitControl;

import javafx.scene.input.KeyCode;
import patterns.factories.Unit;

import java.security.InvalidParameterException;

import static javafx.scene.input.KeyCode.LEFT;

public class MoveLeft implements UnitControl {
    UnitControl next;

    public MoveLeft() {
        this.next = next;
    }

    @Override
    public void setMoveNext(UnitControl next) {
        this.next = next;
    }

    @Override
    public void move(Unit unit, double velocity, KeyCode keyCode) {
        if (LEFT == keyCode) {
            unit.setVelocityGoalX(-velocity);
        } else {
            next.move(unit, velocity, keyCode);
        }
    }
}
