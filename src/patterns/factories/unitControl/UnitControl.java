package patterns.factories.unitControl;

import javafx.scene.input.KeyCode;
import patterns.factories.Unit;

public interface UnitControl {
    void setMoveNext(UnitControl next);
    void move(Unit unit, double velocity, KeyCode keyCode);
}
