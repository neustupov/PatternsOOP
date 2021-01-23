package app;

import static org.junit.jupiter.api.Assertions.*;

import display.Window;
import doc.Document;
import elements.Char;
import elements.Row;
import graphic.Context;
import graphic.Square;
import java.awt.Color;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Тест фасада
 */
@ExtendWith(MockitoExtension.class)
class AppFacadeTest {

  @Spy
  private Document doc;
  private Square square;
  private Context context;
  @Spy
  private Row row;
  @Spy
  private Window window;
  private AppFacade facade;

  @BeforeEach
  void setUp() {
    square = new Square(5, 10);
    context = new Context(2, 3, new Color(5));
    row.insert(new Char('A', null));
    row.insert(new Char('B', null));
    facade = new AppFacade(doc, square, context, row, window);
  }

  @Test
  void startApp() {
    assertEquals(facade.startApp(), "Doc is open Square with height and width: 5-10 and RGB color -16777211 A WinWindowImpl B WinWindowImpl ");
  }
}