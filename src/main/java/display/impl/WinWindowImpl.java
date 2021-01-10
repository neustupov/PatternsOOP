package display.impl;

import java.util.Map;

public class WinWindowImpl implements WindowImpl {

  @Override
  public String deviceChar(Character character) {
    return character.toString() + " WinWindowImpl";
  }

  @Override
  public String deviceRect(int x0, int y0, int x1, int y1) {
    return "Rectangle coords " + x0 + " " + y0 + " " + x1 + " " + y1 + " WinWindowImpl";
  }

  @Override
  public String devicePoly(Map<Integer, Integer> coords) {
    return appendSb(coords) + " WinWindowImpl";
  }

  @Override
  public String drawBorder() {
    return "Draw WinWindowImpl border";
  }

  @Override
  public String drawScroller() {
    return "Draw WinWindowImpl scroller";
  }
}
