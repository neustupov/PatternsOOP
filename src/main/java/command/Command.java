package command;

public interface Command {

  String execute();

  String unexecute();

  boolean reversible();
}
