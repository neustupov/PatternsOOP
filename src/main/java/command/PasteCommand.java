package command;

import doc.Document;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PasteCommand implements Command {

  private String buffer;
  private Document doc;

  @Override
  public String execute() {
    return doc.paste(buffer);
  }

  @Override
  public String unexecute() {
    doc.cut(buffer);
    return buffer + " delete from Doc";
  }

  @Override
  public boolean reversible() {
    return true;
  }
}
