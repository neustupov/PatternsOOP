package command;

import static org.junit.jupiter.api.Assertions.*;

import doc.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CommandTest {

  private Document document;
  private Command command;

  @BeforeEach
  void setUp() {
    document = new Document(null, "First line", "Test");
  }

  @ParameterizedTest
  @ValueSource(strings = {"Paste buffer one", "Paste buffer two"})
  void pasteCommandTestWithParams(String input){
    command = new PasteCommand(input, document);
    assertTrue(command.execute().contains("Paste buffer one") ||
        command.execute().contains("Paste buffer two"));
  }

  @Test
  void pasteCommandTest(){
    command = new PasteCommand("Test", document);
    assertTrue(command.execute().contains("First lineTest"));
  }
}
