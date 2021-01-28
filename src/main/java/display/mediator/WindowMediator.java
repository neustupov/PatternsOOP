package display.mediator;

import display.ApplicationWindow;
import display.DialogWindow;
import display.IconWindow;
import display.Window;
import lombok.Setter;

public class WindowMediator extends Mediator {

  @Setter
  private IconWindow iconWindow;
  @Setter
  private DialogWindow dialogWindow;
  @Setter
  private ApplicationWindow applicationWindow;

  @Override
  public String send(String message, Window sender) {
    StringBuilder sb = new StringBuilder();
    if (sender instanceof DialogWindow) {
      sb.append(iconWindow.notify(message)).append(" ");
      sb.append(applicationWindow.notify(message));
    } else if (sender instanceof IconWindow) {
      sb.append(dialogWindow.notify(message)).append(" ");
      sb.append(applicationWindow.notify(message));
    } else if (sender instanceof ApplicationWindow){
      sb.append(iconWindow.notify(message)).append(" ");
      sb.append(dialogWindow.notify(message));
    }
    return sb.toString();
  }
}
