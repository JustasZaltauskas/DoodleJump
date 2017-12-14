package patterns.factories.unitControl;

import javafx.scene.input.KeyCode;
import patterns.factories.Unit;

import java.awt.event.KeyEvent;

import static javafx.scene.input.KeyCode.LEFT;

public class MoveLeft implements UnitControl {
    UnitControl next;

    @Override
    public void setMoveNext(UnitControl next) {
        this.next = next;
    }

    @Override
    public void move(Unit unit, KeyCode keyCode) {
        if (LEFT == keyCode) {
            unit.moveX(-Unit.getMoveSpeed());
        } else {
            next.move(unit, keyCode);
        }
    }
}
