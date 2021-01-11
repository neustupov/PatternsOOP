package command;

import app.Application;
import doc.Document;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OpenCommand implements Command{

  private String name;
  private Application app;

  @Override
  public String execute() {
    Document doc = new Document(null, "", name);
    app.addDoc(doc);
    doc.open();
    return "Doc with name" + name +  "  is open";
  }

  @Override
  public String unexecute() {
    return null;
  }

  @Override
  public boolean reversible() {
    return false;
  }
}
