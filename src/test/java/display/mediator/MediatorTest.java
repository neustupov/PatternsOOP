package display.mediator;

import static org.junit.jupiter.api.Assertions.*;

import display.ApplicationWindow;
import display.DialogWindow;
import display.IconWindow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Тест паттерна "Посредник"
 */
@ExtendWith(MockitoExtension.class)
class MediatorTest {

  @Spy
  private WindowMediator mediator;
  @Spy
  private IconWindow iconWindow;
  @Spy
  private DialogWindow dialogWindow;
  @Spy
  private ApplicationWindow applicationWindow;

  @BeforeEach
  void setUp() {
    iconWindow.setMediator(mediator);
    dialogWindow.setMediator(mediator);
    applicationWindow.setMediator(mediator);
    mediator.setIconWindow(iconWindow);
    mediator.setDialogWindow(dialogWindow);
    mediator.setApplicationWindow(applicationWindow);
  }

  @Test
  void testMediator() {
    assertEquals(iconWindow.send("Hello from IconWindow"), "DialogWindow get message: Hello from IconWindow ApplicationWindow get message: Hello from IconWindow");
    assertEquals(dialogWindow.send("Hello from DialogWindow"), "IconWindow get message: Hello from DialogWindow ApplicationWindow get message: Hello from DialogWindow");
    assertEquals(applicationWindow.send("Hello from ApplicationWindow"), "IconWindow get message: Hello from ApplicationWindow DialogWindow get message: Hello from ApplicationWindow");
  }
}