package display.impl;

import java.util.Map;

public class MacWindowImpl implements WindowImpl {

  @Override
  public String deviceChar(Character character) {
    return character.toString() + " MacWindowImpl";
  }

  @Override
  public String deviceRect(int x0, int y0, int x1, int y1) {
    return "Rectangle coords " + x0 + " " + y0 + " " + x1 + " " + y1 + " MacWindowImpl";
  }

  @Override
  public String devicePoly(Map<Integer, Integer> coords) {
    return appendSb(coords) + " MacWindowImpl";
  }

  @Override
  public String drawBorder() {
    return "Draw MacWindowImpl border";
  }

  @Override
  public String drawScroller() {
    return "Draw MacWindowImpl scroller";
  }
}
