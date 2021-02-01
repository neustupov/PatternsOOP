package app;

import lombok.Setter;

public abstract class AppStarter {

  @Setter
  private int maxDocs;

  protected String initApp(){
    return "Init App";
  }

  protected abstract String loadDocs();

  protected abstract String openDocs();

  public String startApp(int maxDocs){
    setMaxDocs(maxDocs);
    return "Max docs: " + maxDocs + " " + loadDocs() + " " + openDocs();
  }
}
