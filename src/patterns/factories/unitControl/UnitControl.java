/*
* UnitControl interface used for Chain Of Responsibility pattern.
* Description: Defines methods for subclasses to use.
*
* Author: Justas Žaltauskas
 */

package patterns.factories.unitControl;

import javafx.scene.input.KeyCode;
import patterns.factories.Unit;

public interface UnitControl {
    /*
    * Abstract unitControl methods
     */
    void setMoveNext(UnitControl next);
    void move(Unit unit, double velocity, KeyCode keyCode);
}
