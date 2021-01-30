package doc;

import doc.memento.DocMemento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс документа - учавствует в паттерне "Команда"
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {

  /**
   * Шрифт
   */
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

  /**
   * Сохраняет свое состояние во внешний объект
   *
   * @return DocMemento
   */
  public DocMemento createMemento() {
    return DocMemento.builder()
        .font(this.font)
        .symbols(this.symbols)
        .build();
  }

  /**
   * Устанавливает состояние из внешнего объекта
   *
   * @param memento DocMemento
   */
  public void setMemento(DocMemento memento) {
    this.setFont(memento.getFont());
    this.setSymbols(memento.getSymbols());
  }
}
