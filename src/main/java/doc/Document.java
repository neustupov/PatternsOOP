package doc;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Document {

  @Setter
  private String font;
  private String symbols;
  private String name;

  public String open(){
    return "Doc is open";
  }

  public String close(){
    return "Doc is close";
  }

  public String cut(String buffer){
    return symbols.replace(buffer, "");
  }
  public String copy(){
    return "Doc is copy";
  }
  public String paste(String buffer){
    return symbols.concat(buffer);
  }
}
