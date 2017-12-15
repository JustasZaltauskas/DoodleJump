package patterns.factories.unitControl;

import javafx.scene.input.KeyCode;
import patterns.factories.Unit;

import static javafx.scene.input.KeyCode.SPACE;

public class Shoot implements UnitControl {
    UnitControl next;

    @Override
    public void setMoveNext(UnitControl next) {
        this.next = next;
    }

    @Override
    public void move(Unit unit, KeyCode keyCode) {

        if (SPACE == keyCode) {
            System.out.println("Doodle shoot");
        } else {
            next.move(unit, keyCode);
        }
    }
}
