/*
* IMediator interface.
* Description: Defines methods for mediators to use.
*
* Author: Mantvydas Zakarevičius
 */

package patterns.mediator;

public interface IMediator {
    /*
    * Abstract observer methods
     */
    void notify(Component sender, String event);
}
