package doc.builders;

/**
 * Конкретный билдер
 */
public class WinDocBuilder extends DocBuilder{

  /**
   * Установка шрифта
   */
  @Override
  public void setFont() {
    doc.setFont("WinFont");
  }

  /**
   * Установка данных
   */
  @Override
  public void setSymbols() {
    doc.setSymbols("WinSymbols");
  }

  /**
   * Установк названия
   */
  @Override
  public void setName() {
    doc.setName("WinDoc");
  }
}
