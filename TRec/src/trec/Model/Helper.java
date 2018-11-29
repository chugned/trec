/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trec.Model;

import java.text.NumberFormat;
import java.text.ParsePosition;

/**
 *
 * @author basic
 */
public class Helper {
  
  public Helper() {}
  
  public static boolean isNumeric(String str)
  {
    NumberFormat formatter = NumberFormat.getInstance();
    ParsePosition pos = new ParsePosition(0);
    formatter.parse(str, pos);
    return str.length() == pos.getIndex();
  }
}
