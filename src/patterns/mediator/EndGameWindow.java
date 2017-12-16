/*
* EndGameWindow class.
* Description: EndGameWindow control class.
*
* Author: Mantvydas Zakarevičius
 */

package patterns.mediator;

public class EndGameWindow implements IMediator {
    private String title;
    private Button restartGameButton, exitGameButton;

    public EndGameWindow() {
        title = "Default title!";
        this.restartGameButton = new Button(this);
        this.exitGameButton = new Button(this);
    }

    public Button getRestartGameButton() {
        return this.restartGameButton;
    }

    public Button getExitGameButton() {
        return this.exitGameButton;
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == restartGameButton && event == "CLICK") {
            title = "Restart game?";
            System.out.println("Restart game button clicked: " + title);
        }
        if (sender == exitGameButton && event == "PRESS") {
            title = "Exit game?";
            System.out.println("Exit button clicked: " + title);
        }
    }
}
