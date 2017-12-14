package patterns.factories.unitControl;

import javafx.scene.input.KeyCode;
import patterns.factories.Unit;

import java.awt.event.KeyEvent;

import static javafx.scene.input.KeyCode.RIGHT;

public class NullControl implements UnitControl {
    UnitControl next;

    @Override
    public void setMoveNext(UnitControl next) {
        this.next = next;
    }

    @Override
    public void move(Unit unit, KeyCode keyCode) {
    }
}
