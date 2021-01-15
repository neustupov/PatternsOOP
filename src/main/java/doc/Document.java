package doc;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Класс документа - учавствует в паттерне "Команда"
 */
@NoArgsConstructor
@AllArgsConstructor
public class Document {

  /**
   * Шрифт
   */
  @Setter
  private String font;
  /**
   * Содержимое
   */
  private String symbols;
  /**
   * Название
   */
  private String name;

  /**
   * Открыть
   *
   * @return Результат выполнения
   */
  public String open() {
    return "Doc is open";
  }

  /**
   * Закрыть
   *
   * @return Результат выполнения
   */
  public String close() {
    return "Doc is close";
  }

  /**
   * Вырезать
   *
   * @param buffer Бувфер
   * @return Результат выполнения
   */
  public String cut(String buffer) {
    return symbols.replace(buffer, "");
  }

  /**
   * Копировать
   *
   * @return Результат выполнения
   */
  public String copy() {
    return "Doc is copy";
  }

  /**
   * Вставить
   *
   * @param buffer Буфер
   * @return Результат выполнения
   */
  public String paste(String buffer) {
    return symbols.concat(buffer);
  }
}
