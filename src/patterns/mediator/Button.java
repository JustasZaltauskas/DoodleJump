/*
* Button class.
* Description: Button information and behaviour using component class.
*
* Author: Mantvydas Zakarevičius
 */

package patterns.mediator;

public class Button extends Component {

    public Button(IMediator element) {
        super(element);
        System.out.println("Button mediator has been created!");
    }
}
