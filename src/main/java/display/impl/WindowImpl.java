package display.impl;

import java.util.Map;

public interface WindowImpl {

  String deviceChar(Character character);
  String deviceRect(int x0, int y0, int x1, int y1);
  String devicePoly(Map<Integer, Integer> coords);
  String drawBorder();
  String drawScroller();

  default String appendSb(Map<Integer, Integer> coords){
    StringBuffer sb = new StringBuffer();
    coords.keySet().forEach(key -> {
      sb.append("x: ");
      sb.append(key);
      sb.append(" ");
      sb.append("y:");
      sb.append(coords.get(key));
      sb.append(" ");
    });
    return sb.toString();
  }
}
