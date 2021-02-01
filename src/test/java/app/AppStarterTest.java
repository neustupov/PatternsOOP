package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Тест шаблонного метода
 */
class AppStarterTest {

  @Test
  void testTemplateMethod(){
    AppStarter winAppStarter = new WinApp();
    assertEquals(winAppStarter.startApp(5), "Max docs: 5 Load Win Docs Open Win Docs");

    AppStarter macAppStarter = new MacApp();
    assertEquals(macAppStarter.startApp(5), "Max docs: 5 Load Mac Docs Open Mac Docs");
  }
}