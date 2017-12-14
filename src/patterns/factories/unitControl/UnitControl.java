package patterns.factories.unitControl;

import javafx.scene.input.KeyCode;
import patterns.factories.Unit;

import java.awt.event.KeyEvent;

public interface UnitControl {
    void setMoveNext(UnitControl next);
    void move(Unit unit, KeyCode keyCode);
}
