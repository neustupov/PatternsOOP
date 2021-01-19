package app;

import static org.junit.jupiter.api.Assertions.*;

import display.DialogWindow;
import display.Window;
import doc.Document;
import elements.Row;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AppFacadeTest {

  @Spy
  private Document doc;
  @Spy
  private Row row;
  @Spy
  private Window parentWindow;
  private AppFacade facade;

  @BeforeEach
  void setUp() {
    DialogWindow window = new DialogWindow(parentWindow);
    facade = new AppFacade(doc, row, window);
  }

  @Test
  void startApp() {
    facade.startApp();
  }
}