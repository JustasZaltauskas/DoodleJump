/*
* Component class.
* Description: Component information and functions to be performed by mediators.
*
* Author: Mantvydas Zakarevičius
 */

package patterns.mediator;

public class Component {
    private IMediator element;

    Component(IMediator element) {
        this.element = element;
    }

    public void click() {
        element.notify(this, "CLICK");
    }

    public void keyPress() {
        element.notify(this, "KEYPRESS");
    }
}
