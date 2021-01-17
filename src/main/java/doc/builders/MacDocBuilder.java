package doc.builders;

/**
 * Конкретный билдер
 */
public class MacDocBuilder extends DocBuilder {

  /**
   * Установка шрифта
   */
  @Override
  public void setFont() {
    doc.setFont("MacFont");
  }

  /**
   * Установка данных
   */
  @Override
  public void setSymbols() {
    doc.setSymbols("MacSymbols");
  }

  /**
   * Установк названия
   */
  @Override
  public void setName() {
    doc.setName("MacDoc");
  }
}
