package command;

import doc.Document;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CutCommand implements Command{

  private String buffer;
  private Document doc;

  @Override
  public String execute() {
    doc.cut(buffer);
    return buffer + " cut in Doc";
  }

  @Override
  public String unexecute() {
    doc.paste(buffer);
    return buffer + " insert to Doc";
  }

  @Override
  public boolean reversible() {
    return true;
  }
}
