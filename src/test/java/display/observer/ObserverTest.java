package display.observer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import display.ApplicationWindow;
import display.DialogWindow;
import display.IconWindow;
import display.attributes.Size;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Тест паттерна "Наблюдатель"
 */
@ExtendWith(MockitoExtension.class)
public class ObserverTest {

  @Spy
  private ApplicationWindow applicationWindow;
  @Spy
  private DialogWindow dialogWindow;
  @Spy
  private IconWindow iconWindow;

  @BeforeEach
  void setUp() {
    Size defaultSize = Size.builder().height(10).width(10).build();
    dialogWindow.setSize(defaultSize);
    iconWindow.setSize(defaultSize);

    applicationWindow.registerObserver(dialogWindow);
    applicationWindow.registerObserver(iconWindow);
  }

  @Test
  void testObserver(){
    assertEquals(10, dialogWindow.getSize().getHeight());
    assertEquals(10, dialogWindow.getSize().getWidth());

    applicationWindow.setSize(Size.builder().width(100).height(100).build());

    assertEquals(100, dialogWindow.getSize().getHeight());
    assertEquals(100, dialogWindow.getSize().getWidth());
  }
}
