package doc;

import static org.junit.jupiter.api.Assertions.*;

import doc.builders.DocumentCreator;
import doc.builders.MacDocBuilder;
import doc.builders.WinDocBuilder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Тест "строителя"
 */
@ExtendWith(MockitoExtension.class)
class DocumentTest {

  @Spy
  private DocumentCreator documentCreator;
  @Spy
  private MacDocBuilder macDocBuilder;
  @Spy
  private WinDocBuilder winDocBuilder;

  @Test
  void testBuilder() {
    documentCreator.setBuilder(macDocBuilder);
    documentCreator.constructDoc();
    Document macDoc = documentCreator.getDocument();
    assertEquals(macDoc.getName(), "MacDoc");
    assertEquals(macDoc.getFont(), "MacFont");
    assertEquals(macDoc.getSymbols(), "MacSymbols");

    documentCreator.setBuilder(winDocBuilder);
    documentCreator.constructDoc();
    Document winDoc = documentCreator.getDocument();
    assertEquals(winDoc.getName(), "WinDoc");
    assertEquals(winDoc.getFont(), "WinFont");
    assertEquals(winDoc.getSymbols(), "WinSymbols");
  }
}