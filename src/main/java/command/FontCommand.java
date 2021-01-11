package command;

import doc.Document;

public class FontCommand implements Command {

  private String oldFont;
  private String newFont;
  private Document doc;

  public FontCommand(String newFont, Document doc) {
    this.newFont = newFont;
    this.doc = doc;
  }

  @Override
  public String execute() {
    oldFont = newFont;
    doc.setFont(newFont);
    return "Doc rewrite with font: " + newFont;
  }

  @Override
  public String unexecute() {
    if (oldFont != null) {
      doc.setFont(oldFont);
    }
    return "Return font: " + oldFont + " in Doc";
  }

  @Override
  public boolean reversible() {
    return true;
  }
}
