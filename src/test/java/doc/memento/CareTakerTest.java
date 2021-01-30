package doc.memento;

import static org.junit.jupiter.api.Assertions.*;

import doc.Document;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Тест паттерна "Хранитель"
 */
@ExtendWith(MockitoExtension.class)
class CareTakerTest {

  @Spy
  private Document document;
  @Spy
  private CareTaker careTaker;

  @Test
  void MementoTest(){
    document.setFont("Bold");
    document.setSymbols("ABC");
    careTaker.setDocMemento(document.createMemento());
    assertEquals(document.getSymbols(), "ABC");
    assertEquals(document.getFont(), "Bold");

    document.setFont("Italian");
    document.setSymbols("DEF");
    assertEquals(document.getSymbols(), "DEF");
    assertEquals(document.getFont(), "Italian");

    document.setMemento(careTaker.getDocMemento());
    assertEquals(document.getSymbols(), "ABC");
    assertEquals(document.getFont(), "Bold");
  }
}